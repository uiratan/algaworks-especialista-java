package Desafio_08_20;

import java.util.ArrayList;
import java.util.Arrays;

public class MediaDouble {

    public static void main(String[] args) {
        double media = calcularMedia(59.2, 89.2, 10.2, 104.2, 78);
        System.out.printf("Média: %.2f%n", media);

    }

    private static double calcularMedia(double numero1, double numero2, double... numerosAdicionais) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(numero1);
        numeros.add(numero2);

        for (double numero : numerosAdicionais) {
            numeros.add(numero);
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.size();

//        double[] todosNumeros = Arrays.copyOf(numerosAdicionais, numerosAdicionais.length + 2);
//        todosNumeros[todosNumeros.length - 2] = numero1;
//        todosNumeros[todosNumeros.length - 1] = numero2;
//
//        double soma = Arrays.stream(todosNumeros).sum();

//        for (double numero : todosNumeros) {
//            soma += numero;
//        }

//        return soma / todosNumeros.length;
    }
}
