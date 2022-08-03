package metodos;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("---- Exercício da calculadora ----");
        System.out.println("o resultado de soma de 3 e 6 é " + Calculadora.somar(3, 6));
        System.out.println("o resultado da substração de 9 e 1,8 é " + Calculadora.somar(9, 1.8));
        System.out.println("o resultado da multiplicação entre 7 e 8 é  " + Calculadora.multiplicar(7, 8));
        System.out.println("o resultado da divisãio entre 5 e 2,5 é " + Calculadora.dividir(5, 2.5));

        //Mensagem
        System.out.println("---- Exercício Mensagem ----");
        System.out.println(Mensagem.obterMensagem(9));
        System.out.println(Mensagem.obterMensagem(14));
        System.out.println(Mensagem.obterMensagem(1));

        //Empréstimo
        System.out.println("---- Exercício Empréstimo ----");
        double valorEmprestimo = 1000.00;
        int parcelas = 3;
        Emprestimo.defineEmprestimo(valorEmprestimo, parcelas);

        //Sobrecarga de método
        System.out.println("---- Exercício de Cálculo de área ----");
        System.out.println("Área do quadrado: " + Sobrecarga.calculoArea(4));
        System.out.println("Área do retângulo: " + Sobrecarga.calculoArea(3, 6));
        System.out.println("Área do trapézio: " + Sobrecarga.calculoArea(4, 2, 5));
        System.out.println("Área do losango: " + Sobrecarga.calculoArea(4f, 6f));
    }


}
