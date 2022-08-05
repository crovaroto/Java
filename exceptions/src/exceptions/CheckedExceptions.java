package exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedExceptions {
    public static void main(String[] args)  {
        String nomeArquivo =  "arquivo.txt";
        try {
            imprimirArquivoNoConsole(nomeArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir." + e.getMessage());
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado." + e.getMessage());
            e.printStackTrace();
        }

        finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    private static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();

        } while( line != null);

        bw.flush();
        br.close();
    }
}
