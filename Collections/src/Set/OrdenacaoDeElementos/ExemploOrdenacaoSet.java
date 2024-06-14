package Set.OrdenacaoDeElementos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    /*Dadas as seguintes informações sobre minhas séries preferidas, crie um conjunto e ordene este conjunto exibindo: (nome - genero - tempo de episódio)
    *
    * Série 1 = Nome: Narcos, genero: biografia, tempoEpisodio: 60
    * Série 2 = Nome: The Office, genero: comedia, tempoEpisodio: 25
    * Série 3 = Nome: The Last Of Us, genero: fantasia, tempoEpisodio: 60
    * */

    public static void main(String[] args) {
        Set<Series> minhasSeries  = new HashSet<>(){{
           add(new Series("Narcos", "biografia", 60));
           add(new Series("The Office", "comedia", 25));
           add(new Series("The Last Of Us", "fantasia", 60));
        }};

        Set<Series> minhasSeries1  = new LinkedHashSet<>(){{
            add(new Series("Narcos", "biografia", 60));
            add(new Series("The Office", "comedia", 25));
            add(new Series("The Last Of Us", "fantasia", 60));
        }};

        Set<Series> minhasSeries2  = new TreeSet<>(minhasSeries1);

        Set<Series> minhasSeries3  = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries1);

        System.out.println("--\tOrdem alatória\t--"); // HashSet
        for (Series serie : minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem inserção\t--"); // LinkedHashSet
        for (Series serie : minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--"); // TreeSet
        for (Series serie : minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
        for (Series serie : minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

//        System.out.println("--\tOrdem Genero\t--");
//        System.out.println("--\tOrdem Tempo Episodio\t--");

    }
}
