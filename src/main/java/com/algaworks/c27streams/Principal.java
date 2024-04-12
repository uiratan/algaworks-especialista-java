package com.algaworks.c27streams;

import java.util.List;
import java.util.stream.Stream;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();      
        
        Stream<Produto> stream = produtos.stream();
        Stream<Produto> streamComEstoque = stream.filter(Produto::temEstoque);

    }

}