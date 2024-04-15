package com.algaworks.c34repository.comercial;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.algaworks.c34repository.comercial.entidade.Venda;
import com.algaworks.c34repository.comercial.repositorio.FabricaDeRepositorio;
import com.algaworks.c34repository.comercial.servico.CadastroVendaServico;

public class Principal {

    public static void main(String[] args) {

        try (var fabricaDeRepositorio = new FabricaDeRepositorio()) {
            var vendaRepositorio = fabricaDeRepositorio.criarVendaRepositorio();
            var cadastroVendaServico = new CadastroVendaServico(vendaRepositorio);
            Venda vendaCadastrada = cadastroVendaServico.cadastrar("José da Silva", new BigDecimal("12300.87"),
                    // LocalDate.parse("2023-04-19"));
                    LocalDate.now());

            System.out.println("Venda Cadastrada: " + vendaCadastrada);
            
            System.out.println("Listando todas as vendas");
            vendaRepositorio.consultar().forEach(System.out::println);
        }

    }

}
