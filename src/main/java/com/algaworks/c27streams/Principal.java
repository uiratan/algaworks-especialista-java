package com.algaworks.c27streams;

import java.util.Comparator;
import java.util.List;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();  
        
        // produtos.stream()
        //     .filter(Produto::temEstoque)
        //     .mapToInt(Produto::getQuantidade)
        //     .min()
        //     .ifPresent(System.out::println);

        Produto produtoMaisBarato = produtos.stream()
            .filter(Produto::temEstoque)
            .min(Comparator.comparing(Produto::getPreco))
            .orElseThrow(() -> new RuntimeException("Nenhum produto encontrado"));

        System.out.println(produtoMaisBarato);

    }

}