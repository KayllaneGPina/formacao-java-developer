package Map.OrdenacaoDeElementos;

import java.util.*;

public class ExemploOrdenacaoMap {
    /*Dadas as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionario e ordene este dicionário exibindo (Nome Autor - Nome Livro)
    *
    * Autor = Hawking, Stephen - Livro = nome: Uma breve história do tempo. páginas 256
    * Autor = Duhig, Charles - Livro = nome: O poder do hábito. páginas 408
    * Autor = Harari, Yuval Noah - Livro = nome: 21 Lições para o século 21. páginas 432
    * */


    public static void main(String[] args) {

        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma breve história do tempo", 256));
            put("Duhig, Charles", new Livros("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições para o século 21", 432));
        }};

        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma breve história do tempo", 256));
            put("Duhig, Charles", new Livros("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições para o século 21", 432));
        }};

        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);


        System.out.println("--\tOrdem alatória\t--"); // HashMap
        for (Map.Entry<String, Livros> livro : meusLivros.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("--\tOrdem Inserção\t--"); // LikedHashMap
        for (Map.Entry<String, Livros> livro : meusLivros1.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Alfabética autores\t--"); // TreeMap
        for (Map.Entry<String, Livros> livro : meusLivros2.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética nomes dos livros\t--"); // TreeSet
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros3) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }
}
