package com.algaworks.c27streams;

import java.math.BigDecimal;
import java.util.List;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();      

        // BigDecimal valorEmEstoque = produtos.stream()
        //     // .map(produto -> produto.getPreco().multiply(new BigDecimal(produto.getQuantidade())))
        //     .map(Produto::getValorEstoque)
        //     .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal valorEmEstoque = produtos.stream()
            .reduce(BigDecimal.ZERO, (accumulator, produto) -> {
                BigDecimal valorEstoqueProduto = produto.getPreco()
                    .multiply(new BigDecimal(produto.getQuantidade()));
                return accumulator.add(valorEstoqueProduto);
            }, BigDecimal::add);
        
        // BigDecimal valorEmEstoque = produtos.stream()
        //     .reduce(BigDecimal.ZERO, (accumulator, produto) -> accumulator.add(produto.getValorEstoque()), BigDecimal::add);

        System.out.println("Valor em estoque: " + valorEmEstoque);

    }

}