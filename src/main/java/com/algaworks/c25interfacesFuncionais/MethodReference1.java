package com.algaworks.c25interfacesFuncionais;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

import com.algaworks.c25interfacesFuncionais.estoque.Produto;

public class MethodReference1 {
    public static void main(String[] args) {
        ToIntFunction<Produto> function1 = p -> p.getQuantidade();
        Consumer<Produto> consumer1 = p -> p.inativar();

        ToIntFunction<Produto> function2 = Produto::getQuantidade;
        Consumer<Produto> consumer2 = Produto::inativar;
    }
}
