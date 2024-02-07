public class des20_for2 {
    public static void main(String[] args) {
        // Escreva um programa que solicita um número inteiro positivo
        // para o usuário e imprime na
        //saída uma mensagem dizendo se o número digitado é um número primo ou não

        // Números primos são números naturais que possuem dois divisores: 1 e ele mesmo

        int number = 15;
        boolean prime = false;
        int divisors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors++;
            }
        }

        if (divisors == 2) {
            prime = true;
        }

        System.out.println(prime);
    }
}
