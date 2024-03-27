package com.algaworks.c03estruturasControleOperadores;

import java.util.Scanner;

public class des20_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("Enter the #%d even number: ", i);
            int number = input.nextInt();

            if (number % 2 != 0) {
                System.out.printf("%d is not an even number.%n", number);
                i = i > 1 ? --i : 0;
                continue;
            }

            sum += number;

        }

        System.out.printf("The sum of the numbers is: %d%n", sum);
    }

}
