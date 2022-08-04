package arrays.numeros_aleatorios;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("\nAntecessores dos números aleatórios ");
        for (int numero: numeros) {
            System.out.print(numero - 1 + " ");
        }

        System.out.println("Números aleatórios ");
        for (int numero: numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos números aleatórios ");
        for (int numero: numeros) {
            System.out.print(numero + 1 + " ");
        }
    }
}
