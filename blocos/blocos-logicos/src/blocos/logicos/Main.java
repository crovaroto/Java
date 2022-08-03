package blocos.logicos;

public class Main {
    public static void main(String[] args) {
      System.out.println("---- Operadores Relacionais ----");
      int i1 = 10;
      int i2 = 20;
      float f1 = 4.5f;
      float f2 = 3.5f;
      double d1 = 59.6d;
      char c1 = 'x';
      char c2 = 'y';
      String s1 = "Fulano";
      String s2 = "Fulano";
      String s3 = "Cicrano";
      boolean b1 = true;
      boolean b2 = false;
      boolean b3 = true;
      boolean b4 = false;

      long l1 = 159L;
      long l2 = 8997L;
      byte y1 = 1;
      short h1 = 25;

      System.out.println("i1 == i2 " + (i1 == i2));
      System.out.println("i1 != i2 " + (i1 != i2));
      System.out.println("i1 > i2 " + (i1 > i2));
      System.out.println("i1 <= i2 " + (i1 <= i2));

      System.out.println("f1 == f2 " + (f1 == f2));
      System.out.println("f1 != f2 " + (f1 != f2));
      System.out.println("f1 >= f2 " + (f1 >= f2));
      System.out.println("f1 < f2 " + (f1 < f2));

      System.out.println("c1 == c2 " + (c1 == c2));
      System.out.println("c1 != c2 " + (c1 != c2));
      System.out.println("c1 > c2 " + (c1 > c2));
      System.out.println("c1 <= c2 " + (c1 <= c2));

      System.out.println("s1 == s2 " + (s1 == s2));
      System.out.println("s1 == s3 " + (s1 == s3));
      //System.out.println("s1 >= s2 " + (s1 >= s2));
      //System.out.println("s1 < s2 " + (s1 < s2));

      System.out.println("b1 == b2 " + (b1 == b2));
      System.out.println("b1 != b2 " + (b1 != b2));
      //System.out.println("b1 > b2 " + (b1 > b2));
      //System.out.println("b1 <= b2 " + (b1 <= b2))

      System.out.println("i2 > f1 " + (i2 > f1));
      System.out.println("d1 == h1 " + (d1 == h1));
      //System.out.println("s2 != c1 " + (s2 != c1));
      //System.out.println("s3 != i1 " + (s3 != i1));

      System.out.println("l1 == i2 " + (l1 == i2));
      System.out.println("l2 >= i1 " + (b1 != b2));
      System.out.println("y1 != H1 " + (y1 != h1));
      System.out.println("---- ----");

      System.out.println("---- Operadores Logicos ----");
      System.out.println("b1 && b2 " + (b1 && b2));
      System.out.println("b1 && b3 " + (b1 && b3));
      System.out.println("b2 || b3 " + (b2 || b3));
      System.out.println("b2 || b4 " + (b2 || b4));
      System.out.println("b1 ^ b3 " + (b1 ^ b3));
      System.out.println("b4 ^ b1 " + (b4 ^ b1));
      System.out.println(!b1);
      System.out.println(!b2);

      System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
      System.out.println("((i1 > i2) || (f2 < f1)) " + (((i1 > i2) || (f2 < f1))));

      double salarioMensal = 11893.58d;
      double mediaSalario = 10500d;
      int quantidadeDependente = 4;
      int mediaDependente = 2;

      System.out.println((salarioMensal < mediaSalario) && (quantidadeDependente >= mediaDependente));

      boolean salarioBaixo = salarioMensal < mediaSalario;
      boolean muitosDependentes = quantidadeDependente >= mediaDependente;

      System.out.println((salarioBaixo) && muitosDependentes);

      boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
      System.out.println("recebeAuxilio " + recebeAuxilio);
      System.out.println("---- ----");

      System.out.println("---- Controle de Fluxo ----");
      System.out.println("Mês usando if Flecha " + ControleFluxo.ifFlecha(9));
      System.out.println("Mês usando if sem Flecha " + ControleFluxo.ifSemFlecha(1));
      System.out.println("Férias " + ControleFluxo.ifFerias("Julho"));
      System.out.println("Resultado de auxílio: " + ControleFluxo.ifMenor());
      System.out.println("Índice do dia da semana: " + ControleFluxo.switchSemana("Quarta"));
      System.out.println("---- ----");
    }
}
