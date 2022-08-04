package loop.tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada;

        System.out.println("Qual tabuada deseja ver? ");
        tabuada = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada de " + tabuada + 'x' + i + " é " + (tabuada * i));
        }
    }
}
