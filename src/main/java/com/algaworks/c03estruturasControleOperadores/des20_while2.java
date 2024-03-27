package com.algaworks.c03estruturasControleOperadores;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class des20_while2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero para ser invertido: ");
        int number = input.nextInt();

        int x = 1;

        System.out.print("Numero invertido: ");
        while (number > 0) {
            int resto = number % (x * 10);
            int numero = resto / x;
            number -= resto ;
            x *= 10;

            System.out.print(numero);
        }
    }
}
