package loop.fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial;
        int resultado = 1;

        System.out.println("Forneça o número para cálculo fatorial: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1 ; i--) {
           resultado *= i;
        }

        System.out.println("Fatorial de " + fatorial + " é " + resultado);
    }
}
