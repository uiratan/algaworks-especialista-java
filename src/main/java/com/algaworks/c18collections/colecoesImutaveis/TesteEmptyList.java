package com.algaworks.c18collections.colecoesImutaveis;

import java.util.Collections;
import java.util.List;

public class TesteEmptyList {

    public static void main(String[] args) {
        List<Integer> numeros = Collections.emptyList();
        numeros.add(3);
        System.out.println(numeros);
    }

}