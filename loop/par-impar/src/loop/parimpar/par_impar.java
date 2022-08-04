package loop.parimpar;

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int pares = 0 ;
        int impares = 0;
        int quantNumeros;
        int i = 0;

        System.out.println("Quantidade de números a informar: ");
        quantNumeros =  scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if ((numero%2) == 0)
                pares++;
            else
                impares++;
            i++;
        } while (i < quantNumeros);

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}
