import java.io.InputStream;
import java.util.Scanner;

public class des09_calculadora_IMC {
/*
    Condição IMC        em mulheres         IMC em homens
Abaixo do peso          Menor que 19.1      Menor que 20.7
No peso ideal           Entre 19.1 e 25.8   Entre 20.8 e 26.4
Um pouco acima do peso  Entre 25.9 e 27.3   Entre 26.5 e 27.8
Acima do peso ideal     Entre 27.4 e 32.3   Entre 27.9 e 31.1
Obeso                   Maior que 32.3      Maior que 31.1
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Homem (0) ou Mulher (1): ");
        int sexo = entrada.nextInt();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Peso");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);

        String condicao;

        if (sexo == 0) {
            condicao = calcularCondicaoHomem(imc);
        } else {
            condicao = calcularCondicaoMulher(imc);
        }

        System.out.printf("Peso %.2f para a altura %.2f no sexo %s, com IMC de %.2f: %s",
            peso,
            altura,
            sexo == 0 ? "HOMEM" : "MULHER",
            imc,
            condicao);
    }

    private static String calcularCondicaoMulher(double imc) {
        if (imc < 19.1) {
            return "Abaixo do peso";
        } else if (imc < 25.8) {
            return "No peso ideal";
        } else if (imc < 27.3) {
            return "Um pouco acima do peso";
        } else if (imc < 32.3) {
            return "Acima do peso ideal";
        } else {
            return "Obeso";
        }
    }

    private static String calcularCondicaoHomem(double imc) {
        if (imc < 20.7) {
            return "Abaixo do peso";
        } else if (imc < 26.4) {
            return "No peso ideal";
        } else if (imc < 27.8) {
            return "Um pouco acima do peso";
        } else if (imc < 31.1) {
            return "Acima do peso ideal";
        } else {
            return "Obeso";
        }
    }
}
