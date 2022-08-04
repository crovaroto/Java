package arrays.consoantes;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int qtd = 0;
        int i = 0;

         do {
             System.out.println("Informe uma letra: ");
             String letra =  scan.next();

             if (!(letra.equalsIgnoreCase("a") |
                   letra.equalsIgnoreCase("e") |
                   letra.equalsIgnoreCase("i") |
                   letra.equalsIgnoreCase("o") |
                   letra.equalsIgnoreCase("u"))) {
                 consoantes[i] =  letra;
                 qtd++;
             }
            i++;
         } while (i < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante: consoantes) {
            if (!(consoante == null))
                System.out.print(consoante + " ");
        }

    }
}
