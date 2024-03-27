package com.algaworks.c05orientacaoObjetos.des0507_clinica_vet;

public class NumeroUtil {
    static int biggestIntNumber(int a, int b, int c) {
        return biggestIntNumber(biggestIntNumber(a, b), c);
    }

    static int biggestIntNumber(int a, int b) {
        return a > b ? a : b;
    }

    static double biggestDoubleNumber(double a, double b, double c) {
        return biggestDoubleNumber(biggestDoubleNumber(a, b), c);
    }

    static double biggestDoubleNumber(double a, double b) {
        return a > b ? a : b;
    }
}
