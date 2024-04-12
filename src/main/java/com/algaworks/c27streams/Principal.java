package com.algaworks.c27streams;

import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();      

        // IntBinaryOperator operacaoSoma = (subtotal, valor) -> subtotal + valor;

        // int totalEstoque = produtos.stream()
        //     .mapToInt(p -> p.getQuantidade())
        //     // .reduce(0, operacaoSoma);
        //     // .reduce(0, (subtotal, valor) -> subtotal + valor);
        //     .reduce(0, Integer::sum);

        // System.out.println("Total em estoque: " + totalEstoque);

        
        int maximoEstoque = produtos.stream()
            .mapToInt(p -> p.getQuantidade())
            .reduce(0, Integer::min);

        System.out.println(maximoEstoque);

    }

}