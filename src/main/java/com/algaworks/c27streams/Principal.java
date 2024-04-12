package com.algaworks.c27streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import com.algaworks.c27streams.estoque.CadastroProduto;
import com.algaworks.c27streams.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();  
        // List<Produto> produtos = new ArrayList<>();    

        OptionalInt maiorQuantidadeOptional = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(Integer::max);
            // .reduce(0, Integer::max);
        
        int maiorQuantidade = maiorQuantidadeOptional.orElseThrow(() -> new RuntimeException("Quantidade não encontrada"));
        
        System.out.println("Total em estoque: " + maiorQuantidade);

    }

}