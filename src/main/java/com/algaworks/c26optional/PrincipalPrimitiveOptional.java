package com.algaworks.c26optional;

import java.util.Optional;
import java.util.OptionalInt;

public class PrincipalPrimitiveOptional {

    public static void main(String[] args) {
        OptionalInt resultadoOptional = dividir(10, 3);

        resultadoOptional.ifPresentOrElse(
            resultado -> System.out.println("Divisão: " + resultado), 
            () -> System.out.println("Divisão inválido"));
    }

    private static OptionalInt dividir(int i, int j) {
        if (j == 0) return OptionalInt.empty();

        return OptionalInt.of(i / j);
    }
}
