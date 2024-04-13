package com.algaworks.c33jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa por nome do cliente: ");
        String nomePesquisa = scanner.nextLine();

        try (
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercial", "root", "");
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM venda WHERE nome_cliente like ?");
        ) {
            comando.setString(1, "%" + nomePesquisa + "%");
            ResultSet resultado = comando.executeQuery();

            while (resultado.next()) {
                Long id = resultado.getLong("id");
                String nomeCliente = resultado.getString("nome_cliente");
                BigDecimal valorTotal = resultado.getBigDecimal("valor_total");
                Date dataPagamento = resultado.getDate("data_pagamento");
                System.out.printf("%d - %s - R$%.2f - %s%n", id, nomeCliente, valorTotal, dataPagamento);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro de banco de dados");
            e.printStackTrace();
        } 

    }
}
