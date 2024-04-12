package com.algaworks.c27streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;

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
            // .collect(() -> new ArrayList<>(), 
            //     (lista, elemento) -> lista.add(elemento),
            //     (lista1, lista2) -> lista1.addAll(lista2));
            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(categorias);

    }

}