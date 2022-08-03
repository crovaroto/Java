package metodos;

public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;

    }

    public static double getTaxaTresParcelas() {
        return 0.45;

    }

    public static double calcular (double valor, int parcelas) {
        double valorFinal = 0.00;
        if (parcelas == 2) {
            valorFinal = valor * (getTaxaDuasParcelas());
        }
        else if (parcelas == 3) {
            valorFinal = valor * (getTaxaTresParcelas());
        }
        else {
          valorFinal = 0.00;
        }
      return valorFinal;
    }

    public static void defineEmprestimo(double valorEmprestimo, int parcelas) {
        double valorEmprestimoFinal;
        switch (parcelas) {
            case 2:  {
                valorEmprestimoFinal = Emprestimo.calcular(valorEmprestimo, Emprestimo.getDuasParcelas());
                System.out.println("Valor do empréstimo é de R$" + valorEmprestimoFinal);
                break;
            }
            case 3:  {
                valorEmprestimoFinal = Emprestimo.calcular(valorEmprestimo, Emprestimo.getTresParcelas());
                System.out.println("Valor do empréstimo é de R$" + valorEmprestimoFinal);
                break;
            }
            default:
                System.out.println("Quantidade de parcelas não aceita");
        }
    }

}
