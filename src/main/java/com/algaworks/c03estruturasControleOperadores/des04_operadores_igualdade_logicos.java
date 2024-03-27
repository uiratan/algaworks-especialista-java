package com.algaworks.c03estruturasControleOperadores;

import java.util.Scanner;

public class des04_operadores_igualdade_logicos {
    /*
    São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, etc
    São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, etc
    Não são bissextos todos os demais anos
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int continuar = 1;

        while (continuar == 1) {
            System.out.println("Informe o ano: ");
            int ano = entrada.nextInt();
            System.out.printf("O ano %d %s bissexto%n", ano, isBissexto(ano) ? "é" : "não é");
            System.out.println("Para continuar digite 1");
            continuar = entrada.nextInt();
        }
    }

    private static boolean isBissexto(int ano) {
        if ((ano % 400) == 0) {
            return true;
        }

        return (ano % 4) == 0 && (ano % 100) != 0;
    }
}
