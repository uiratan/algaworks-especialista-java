package com.algaworks.c09jvm.aula92;

public class Teste2 {
    public static void main(String[] args) {
        int a = 40;
        metodo1(a);
    }

    static void metodo1(int x) {
        int z = x * 2;
        metodo2();
    }

    static void metodo2() {
        Produto produto = new Produto();
        produto.codigo = 10;
        produto.preco = 120.34;

    }
}
