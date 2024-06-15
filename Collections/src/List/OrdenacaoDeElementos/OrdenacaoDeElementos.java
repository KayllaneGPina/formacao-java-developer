package List.OrdenacaoDeElementos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeElementos {
    /*Dadas as seguintes informações sobre meus gatos, crie uma lista
    e ordene esta lista exibindo:
    (nome - idade - cor);

    Gato 1 = nome: Jon, idade: 18, cor: preto
    Gato 2 = nome: Simba, idade: 6, cor: tigrado
    Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 17, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Nemo", 12, "amarela"));
        }};

        System.out.println("--\tOrdem de insercao\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de aleatoria\t--");
        Collections.shuffle(meusGatos); // Não existe no arrayList um método native então mais uma vez utilizamos as Collections
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de natural\t--"); // Ordenando por nome utilizando a interface Comparable
        Collections.sort(meusGatos); // Esse método utiliza o Comparable
        System.out.println(meusGatos);

//        Obs.: Prestar atenção na diferença entre o CompaRABLE e o CompaRATOR

        System.out.println("--\tOrdem de idade\t--");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de cor\t--");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Nome/Cor/Idade\t--");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
