package com.algaworks.c34repository.comercial;

import java.time.LocalDate;

import com.algaworks.c34repository.comercial.entidade.Venda;
import com.algaworks.c34repository.comercial.servico.CadastroVendaServico;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        var cadastroVendaServico = new CadastroVendaServico();
        Venda vendaCadastrada = cadastroVendaServico.cadastrar("José da Silva",  new BigDecimal("12300.87"), 
            // LocalDate.parse("2023-04-19"));
            LocalDate.now());
    
        System.out.println(vendaCadastrada);
    }
    
}

