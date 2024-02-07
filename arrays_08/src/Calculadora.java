public class Calculadora {

    static double calcularMedia(int[] numeros) {
        int total = 0;

        // enhanced for
        for (int numero : numeros) {
            total += numero;
        }

//        for (int i = 0; i < numeros.length; i++) {
//            total += numeros[i];
//        }

        return (double) total / numeros.length;
    }
}
