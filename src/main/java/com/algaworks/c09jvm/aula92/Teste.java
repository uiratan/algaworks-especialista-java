package com.algaworks.c09jvm.aula92;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);
    }
}
