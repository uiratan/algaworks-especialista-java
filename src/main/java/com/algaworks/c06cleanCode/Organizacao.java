package com.algaworks.c06cleanCode;

public class Organizacao {

    public static final double TAXA_FATURAMENTO_PARA_LIMITE_CREDITO = 0.10;
    public static final int LIMITE_CREDITO_MINIMO = 1000;

    String razaoSocial;
    double faturamentoAnual;

    double calcularLimiteCredito(double faturamentoAnual) {
        double limiteCredito = faturamentoAnual * TAXA_FATURAMENTO_PARA_LIMITE_CREDITO;

        if (limiteCredito < LIMITE_CREDITO_MINIMO) {
            limiteCredito = 1000;
        }

        return limiteCredito;
    }

}
