package com.algaworks.c27streams;

import java.util.List;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();      
        
        // boolean temProdutoNoEstoque = produtos.stream()
        //     .peek(System.out::println)
        //     .anyMatch(Produto::temEstoque);

        // System.out.println("Tem produtos no estoque? " + temProdutoNoEstoque);

        // boolean todosProdutosPossuemEstoque = produtos.stream()
        //     .peek(System.out::println)
        //     .allMatch(Produto::temEstoque);

        // System.out.println("Todos os produtos possuem estoque? " + todosProdutosPossuemEstoque);

        boolean nenhumProdutoPossuiEstoque = produtos.stream()
            .peek(System.out::println)
            .noneMatch(Produto::temEstoque);

        System.out.println("Nenhum produto possue estoque? " + nenhumProdutoPossuiEstoque);
            
    }

}