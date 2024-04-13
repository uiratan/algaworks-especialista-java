package com.algaworks.c33jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

    public static void main(String[] args) {
        try (
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercial", "root", "");
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery("SELECT * FROM venda");
        ) {

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
