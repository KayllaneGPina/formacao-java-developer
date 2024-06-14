package List.OrdenacaoDeElementos;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        var nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        var cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
