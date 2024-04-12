package com.algaworks.c27streams;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();  

        // int totalEstoque = produtos.stream()
        //     .mapToInt(Produto::getQuantidade)
        //     .sum();
               
        // System.out.println(totalEstoque);

        // double mediaEstoque = produtos.stream()
        //     .mapToInt(Produto::getQuantidade)
        //     .average()
        //     .orElseThrow(() -> new RuntimeException("Nenhum item encontrado"));
           
        // System.out.println(mediaEstoque);

        long totalProdutosComEstoque = produtos.stream()
            .filter(Produto::temEstoque)
            .count();
       
        System.out.println(totalProdutosComEstoque);

    }

}