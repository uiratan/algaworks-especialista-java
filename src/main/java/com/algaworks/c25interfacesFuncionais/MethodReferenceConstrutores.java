package com.algaworks.c25interfacesFuncionais;

import java.util.function.Function;

import com.algaworks.c25interfacesFuncionais.estoque.Produto;

public class MethodReferenceConstrutores {
    public static void main(String[] args) {
        // Function<String, Produto> function = nome -> new Produto(nome);
        Function<String, Produto> function = Produto::new;
        Produto produto = function.apply("Cadeira gamer");

        System.out.println(produto);
    }
}
