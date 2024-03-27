package com.algaworks.c05orientacaoObjetos.aulas;

public class PrincipalProd {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Produto produto1 = new Produto();
        @SuppressWarnings("unused")
        Produto produto2 = new Produto();

        Produto.alterarCustoEmbalagem(20);
        Produto.imprimirCustoEmbalagem();

//        produto1.custoEmbalagem = 10;
//        produto2.custoEmbalagem = 15;
//
//        produto1.imprimirCustoEmbalagem();
//        produto2.imprimirCustoEmbalagem();
    }
}
