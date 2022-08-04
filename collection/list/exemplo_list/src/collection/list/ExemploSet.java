package collection.list;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        Set<Double> notas = new HashSet<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("confira todas as notas na ordem que foram informadas:");
        for (double nota: notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a menor nota:" + Collections.min(notas));
        System.out.println("Exiba a maior nota:" + Collections.max(notas));

        System.out.print("Exiba a soma das nota: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.00;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média nota:" + soma/notas.size());

        System.out.println("Remova a nota 0.0" + notas.remove(0.00));

        System.out.println("Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> removeNotas = notas.iterator();
        while (removeNotas.hasNext()) {
            Double next = removeNotas.next();
            if (next < 7)
                removeNotas.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informados.");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(8.5);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(10.0);
        notas2.add(4.1);
        notas2.add(7.5);
        System.out.println(notas2);

        System.out.println("Exiba toddas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague toda a lista");
        notas.clear();

        System.out.println("Confira se a lista está vazia " + notas.isEmpty());


    }
}
