package com.algaworks.c02fundamentos;

import java.util.Scanner;

public class EntradaDeDados {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Nome: ");
    String nome = in.nextLine();

    System.out.print("Valor por hora: ");
    double valor = in.nextDouble();

    System.out.print("Horas trabalhadas: ");
    int horas = in.nextInt();

    double valorTotal = horas * valor;

    System.out.print("Valor dos descontos: ");
    double descontos = in.nextDouble();

    in.nextLine();

    System.out.println("Folha de pagamento: " + nome);
    System.out.printf("%d horas x R$%.2f = R$%.2f%n", horas, valor, valorTotal);
    System.out.printf("Descontos: R$%.2f%n", descontos);
    System.out.printf("Total devido: R$%.2f%n", valorTotal - descontos);

  }

}
