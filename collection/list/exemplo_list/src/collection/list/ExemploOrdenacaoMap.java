package collection.list;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("---\tOrdem Aleatória\t---");
        Map<String, Livro> meusLivros = new HashMap<>() {{
           put("Hawkings, Stephen", new Livro("Uma Breve História do Tempo", 230));
           put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
           put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("---\tOrdem Inserção\t---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawkings, Stephen", new Livro("Uma Breve História do Tempo", 230));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("---\tOrdem Alfabética autores\t---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("---\tOrdem Alfabética livros\t---");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public Integer getPaginas() {
        return paginas;
    }

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
}


class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}