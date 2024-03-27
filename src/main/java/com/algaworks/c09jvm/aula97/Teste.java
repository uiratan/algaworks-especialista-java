package com.algaworks.c09jvm.aula97;

import java.util.ArrayList;

public class Teste {
  public static void main(String[] args) {
    ArrayList<Cliente> clientes = new ArrayList<>();
    int quantidade = 1;

    while (true) {
      System.out.printf("%d - ", quantidade++);
      imprimirUsoMemoria();
      clientes.add(new Cliente());
    }
  }

  static void imprimirUsoMemoria() {
    System.out.printf("Máxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));
    System.out.printf("Total empenhada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));
    System.out.printf("Disponível: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));

    long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    System.out.printf("Usada: %s%n", emMegabytes(memoriaUsada));

    System.out.println("----");
  }

  static String emKilobytes(long bytes) {
    return String.format("%.2fKB", bytes / 1024d);
  }

  static String emMegabytes(long bytes) {
    return String.format("%.2fMB", bytes / 1024d / 1024d);
  }
}
