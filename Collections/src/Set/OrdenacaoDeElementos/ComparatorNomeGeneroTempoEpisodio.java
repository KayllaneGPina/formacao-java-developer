package Set.OrdenacaoDeElementos;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series> {

    @Override
    public int compare(Series s1, Series s2) {
        var nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        var genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
