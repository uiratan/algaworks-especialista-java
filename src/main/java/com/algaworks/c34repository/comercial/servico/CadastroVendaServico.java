package com.algaworks.c34repository.comercial.servico;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.algaworks.c34repository.comercial.entidade.Venda;
import com.algaworks.c34repository.comercial.repositorio.VendaRepositorio;

public class CadastroVendaServico {

    private final VendaRepositorio vendaRepositorio;

    public CadastroVendaServico(VendaRepositorio vendaRepositorio) {
        this.vendaRepositorio = vendaRepositorio;
    }

    public Venda cadastrar(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegocioException("Valor total deve ser maior que 0");
        }

        if (dataPagamento.isAfter(LocalDate.now())) {
            throw new NegocioException("Data do pagamento não pode ser uma data futura");
        }

        return vendaRepositorio.adicionar(new Venda(null, nomeCliente, valorTotal, dataPagamento));
    }

}