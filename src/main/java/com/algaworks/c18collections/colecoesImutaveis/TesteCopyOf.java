package com.algaworks.c18collections.colecoesImutaveis;

import java.util.ArrayList;
import java.util.List;

public class TesteCopyOf {

    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);

        var numeros2 = List.copyOf(numeros1);

        numeros1.add(4);

        System.out.println(numeros2);
    }

}