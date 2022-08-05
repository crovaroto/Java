package exceptions;

import javax.swing.*;
import java.io.*;

public class CustomExceptions1 {
    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoConsole(nomeArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    private static void imprimirArquivoConsole(String nomeArquivo) {
        try{
            BufferedReader br = lerArquivo(nomeArquivo);
            String line =  br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro não esperado. " + e.getMessage());
        }
    }

    private static BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAberturaArquivoException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        }
        catch (FileNotFoundException e) {
            throw new ImpossivelAberturaArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaArquivoException extends Exception {
    private final String nomeArquivo;
    private final String diretorio;

    public ImpossivelAberturaArquivoException(String nomeArquivo, String diretorio) {
        super("O arquivo" + nomeArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaArquivoException{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
