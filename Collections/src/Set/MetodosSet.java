package Set;

import java.util.*;

public class MetodosSet {
    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

    public static void main(String[] args) {

        // Formas de inicializar um Set
//        Set notas = new HashSet(); -> Antes do java 5
//        HashSet<Double> notas = new HashSet<>();
//        Set<Double> notas = new HashSet<>(); -> Generics(jdk 5) - Diamont Operator (jdk7)
//        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

//        System.out.println("Exiba a posição da nota 5.0: " ); -> No HashSet, os elementos ficam na ordem aleatória e não é possível fazer as buscar por meio das posições

//        System.out.println("Adiciona na lista a nota 8.0 na posição 4"); -> Mais uma vez, no HashSet não trabalhamos com posições

//        System.out.println("Substitua a nota 5.0 pela nota 6.0"); -> Também não temos métodos de substituição

        System.out.println("Confira s a nota 5.0 está no conjunto: " + notas.contains(5d)); // Retorna true or false


//        System.out.println("Exiba a terceira nota adicionada: "); -> Não temos o método get() para passar o index

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // Como o Set é uma collection, usamos a classe Collection que tem um método nativo para verificacao do menor numero em uma collection

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        var soma = 0.0;

        while(iterator.hasNext()) {
            var next = iterator.next();
            soma += next;
        }
        System.out.println(soma);


        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

//        System.out.println("Remova a nota da posição 0: ");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            var next = iterator1.next();
            if (next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: "); // Não conseguimos exibir as notas na ordem informada utilizando o HashSet então temos que mudar para LinkedHashSet
        Set<Double> notas2 = new LinkedHashSet<>(); // Lembrando que no Set não é permitido elementos repetidos, então, só teremos um 7
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);


        System.out.println("Exiba todas as notas na ordem crescente: "); // Utilizaremos a TreeSet porque ela organiza os elementos por ordem natural (número, ou alfabética, dependendo do tipo dos elementos)
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();


        System.out.println("Confira se  conjunto está vazio: " + notas.isEmpty());

        System.out.println("Exiba a soma dos valores: ");
        System.out.println("Exiba a soma dos valores: ");
        System.out.println("Exiba a soma dos valores: ");

    }
}
