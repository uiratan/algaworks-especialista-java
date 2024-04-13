package com.algaworks.c33jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String dml = """
                        INSERT INTO venda (
                            nome_cliente, 
                            valor_total, 
                            data_pagamento) 
                        VALUES (?, ?, ?)
                    """;

            try (
                Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercial", "root", "");
                PreparedStatement comando = conexao.prepareStatement(dml, Statement.RETURN_GENERATED_KEYS);
            ) {

                conexao.setAutoCommit(false);

                try {
                    do { 
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
         
                        System.out.print("Valor total: ");
                        BigDecimal valorTotal = new BigDecimal(scanner.nextLine());
         
                        System.out.print("Data de pagamento: ");
                        LocalDate dataPagamento = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                        comando.setString(1, nome);
                        comando.setBigDecimal(2, valorTotal);
                        comando.setDate(3, Date.valueOf(dataPagamento));
                        comando.executeUpdate();
   
                        ResultSet codigoResultSet = comando.getGeneratedKeys();
                        codigoResultSet.next();
                        long codigoGerado = codigoResultSet.getLong(1);
   
                        System.out.println("Venda registrada com codigo " + codigoGerado + "!");
                        
                        System.out.print("Continuar?");
                    } while ("s".equalsIgnoreCase(scanner.nextLine()));

                    conexao.commit();
                    
                } catch (Exception e) {
                    conexao.rollback();
                    throw new RuntimeException(e);
                }

            } catch (Exception e) {
                System.out.println("Erro de banco de dados");
                e.printStackTrace();
            }
        } 

    }
}
