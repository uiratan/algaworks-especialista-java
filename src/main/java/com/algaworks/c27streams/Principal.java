package com.algaworks.c27streams;

import static java.util.stream.Collectors.toCollection;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Categoria;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();  
        
        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(p -> p.getCategorias().stream())
            .distinct()
            // .collect(toList());
            .collect(toCollection(ArrayList::new));

        System.out.println(categorias);

    }

}