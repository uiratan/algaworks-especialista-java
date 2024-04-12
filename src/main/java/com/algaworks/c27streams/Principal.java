package com.algaworks.c27streams;

import java.util.List;
import java.util.Optional;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();      
        
        Optional<Produto> produtoOptional = produtos.stream()
            .peek(System.out::println)
            .filter(Produto::temEstoque)
            .filter(Produto::isInativo)
            .findAny();


        System.out.println("------------");
        Produto produto = produtoOptional.orElseThrow(() -> new RuntimeException("Nenhum produto encontrado!"));

        System.out.println(produto);
            
    }

}