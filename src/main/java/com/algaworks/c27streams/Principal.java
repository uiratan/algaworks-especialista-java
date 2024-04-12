package com.algaworks.c27streams;

import java.util.Comparator;
import java.util.List;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();      
        
        produtos.stream()
            .filter(Produto::temEstoque)
            .sorted(Comparator.comparingInt(Produto::getQuantidade))
            .forEach(produto -> System.out.printf("%s = %d unidades%n",
                produto.getNome(), produto.getQuantidade()));

        
    }

}