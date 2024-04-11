package com.algaworks.c25interfacesFuncionais;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

import com.algaworks.c25interfacesFuncionais.estoque.Produto;

public class MethodReference1 {
    public static void main(String[] args) {
        ToIntFunction<Produto> function1 = p -> p.getQuantidade();
        System.out.println(function1.applyAsInt(new Produto("Cadeira gamer")));

        Consumer<Produto> consumer1 = p -> p.inativar();
        consumer1.accept(new Produto("Cadeira gamer"));

        ToIntFunction<Produto> function2 = Produto::getQuantidade;
        System.out.println(function2.applyAsInt(new Produto("Cadeira gamer")));

        Consumer<Produto> consumer2 = Produto::inativar;
        consumer2.accept(new Produto("Cadeira gamer"));
    }
}
