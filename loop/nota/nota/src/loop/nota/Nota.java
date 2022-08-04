package loop.nota;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        int nota;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma nota, entre 0 e 10:");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10 ) {
            System.out.println("A nota informada é inválida. Informe outra nota: ");
            nota = scan.nextInt();
        }
    }
}
