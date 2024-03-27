package com.algaworks.c03estruturasControleOperadores;

import java.util.Scanner;

public class AnoBissexto {

  public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {
      System.out.print("Ano: ");
      int ano = entrada.nextInt();

      boolean anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

      System.out.printf("Bissexto: %b%n", anoBissexto);
    }
  }

}
