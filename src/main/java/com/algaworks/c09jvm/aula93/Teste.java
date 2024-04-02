package com.algaworks.c09jvm.aula93;


public class Teste {
  public static void main(String[] args) {
    imprimirUsoMemoria();

    @SuppressWarnings("unused")
    byte[] x = new byte[500 * 1024 * 1024];
    imprimirUsoMemoria();
    x = null;

    System.gc();

    imprimirUsoMemoria();
  }

  static void imprimirUsoMemoria() {
    //    System.out.println("Informações da Memória HEAP");
    //    System.out.println("-----------------------------");
    System.out.printf("Máxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));
    System.out.printf("Total empenhada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));
    System.out.printf("Disponível: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));

    long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    System.out.printf("Usada: %s%n", emMegabytes(memoriaUsada));

    System.out.println("----");

    //    System.out.printf("Processadores: %s%n", Runtime.getRuntime().availableProcessors());
  }

  static String emKilobytes(long bytes) {
    return String.format("%.2fKB", bytes / 1024d);
  }

  static String emMegabytes(long bytes) {
    return String.format("%.2fMB", bytes / 1024d / 1024d);
  }
}