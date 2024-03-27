package com.algaworks.c08arrays.desafio0810;

public class ItemCardapio {

    String descricao;
    double preco;

    boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
        if (preco >= precoMinimo && preco <= precoMaximo) {
            return true;
        }
        return false;
    }

    void imprimir() {
        System.out.printf("%s x R$%.2f%n", descricao, preco);
    }

}
