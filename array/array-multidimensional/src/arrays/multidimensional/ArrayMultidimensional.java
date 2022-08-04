package arrays.multidimensional;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] numeros = new int[4][4];

        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : numeros) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
