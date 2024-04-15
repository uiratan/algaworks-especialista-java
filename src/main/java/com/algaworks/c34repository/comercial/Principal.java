package com.algaworks.c34repository.comercial;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.algaworks.c34repository.comercial.entidade.Venda;
import com.algaworks.c34repository.comercial.repositorio.VendaRepositorio;
import com.algaworks.c34repository.comercial.servico.CadastroVendaServico;

public class Principal {

    public static void main(String[] args) {
        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercial", "root", "")) {
            
            var vendaRepositorio = new VendaRepositorio(conexao);
            var cadastroVendaServico = new CadastroVendaServico(vendaRepositorio);

            Venda vendaCadastrada = cadastroVendaServico.cadastrar("José da Silva",  new BigDecimal("12300.87"), 
                // LocalDate.parse("2023-04-19"));
                LocalDate.now());
   
            System.out.println("Venda Cadastrada: " + vendaCadastrada);

            System.out.println("Listando todas as vendas");

            vendaRepositorio.consultar().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}

