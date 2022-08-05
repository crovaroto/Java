package exceptions;

import javax.swing.*;

public class UncheckedExceptions {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro. " + e.getMessage());
        }
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Houve um erro no cálculo realizado. " + e.getMessage());
        }
        finally {
            System.out.println("Chegou no finally");
        }
        System.out.println("Chegou aqui...");
    }

    private static int dividir(int a, int b) {
        return (a/b);
    }
}
