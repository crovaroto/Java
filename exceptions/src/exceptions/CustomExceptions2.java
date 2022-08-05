package exceptions;

import javax.swing.*;

public class CustomExceptions2 {
    public static void main(String[] args) {
        int[] numerador = {2, 5, 8, 10};
        int[] denominador =  {2, 4, 0 ,2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("Divisão entre " + numerador[i] + " e denominador " + denominador[i] + " não é exata.", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }
            catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null, "Há uma divisão por zero." + ex.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "A quantidade de numeradores é diferente da quantidade de denominadores. " + ex.getMessage());
            }




        }
        System.out.println("O programa continua...");
    }
}

class DivisaoNaoExataException extends Exception {
    private final int numerador;
    private final int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "DivisaoNaoExataException{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}
