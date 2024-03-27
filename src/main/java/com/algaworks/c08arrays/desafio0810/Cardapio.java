package com.algaworks.c08arrays.desafio0810;

import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        int tamanhoItens = itens.length;
        itens = Arrays.copyOf(itens, tamanhoItens+1);
        itens[tamanhoItens] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];
        System.arraycopy(itens, 0, novosItens, 0, indice);
        System.arraycopy(itens, indice+1,
            novosItens, indice, novosItens.length - indice);
        itens = novosItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}
