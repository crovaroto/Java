package loop.maiormedia;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int i = 0;
        int maior  = 0;
        int media = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero > maior)
                maior = numero;

            media += numero;

            i++;
        } while (i <= 5);

        System.out.println("Maior números: " + maior);
        System.out.println("Média entre os números: " + (media / 5));

    }
}
