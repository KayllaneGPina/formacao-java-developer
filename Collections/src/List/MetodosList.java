package List;

import java.util.*;

public class MetodosList {
    public static void main(String[] args) {
//        Crie uma lista e adicione as sete notas:

//        Formas de inicializar Lists:
//        List notas = new ArrayList<>(); - Antes do Java 5
        List<Double> notas = new ArrayList<>(); // Forma mais convencional
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); - Dessa maneira, não conseguimos adicionar e nem remover elementos da lista
//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); - Também é imultável e não podemos adicionar e remover

        notas.add(7d);
        notas.add( 8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);

//        Exiba a posição da nota 5.0
        System.out.println("Posição da nota 5.0: " + notas.indexOf(5d));

//        Adicione na lista uma nota
        notas.add(4, 8d); // Primeiro, adicionamos o index e depois o elemento
        System.out.println(notas);

//        Substitua a nota 5 pela notas 6.0
        notas.set(notas.indexOf(5d), 6.0);

//        Confira se a nota 5.0 está na lista
        System.out.println("A nota 5 está na lista? " + notas.contains(5d));

//        Exiba todas as notas na ordem que foram informadas
        for (Double nota : notas) System.out.println(nota);

//        Exiba a terceira nota adicionada
        System.out.println("Exibindo a terceira nota adicionada: " + notas.get(2)); // Aqui devemos informar o index da nota desejada

//        Exiba a menor nota
        System.out.println("Menor nota: " + Collections.min(notas)); // Na list não existe um método nativo que podemos usar para fazer essas operação mas a classe Collection possui esse método

//        Exiba a maior nota
        System.out.println("Maior nota: " + Collections.max(notas));

//        Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        var soma = 0d;
        while (iterator.hasNext()) {
            var next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das nota: " + soma); // Também não existe um método nativo para fazer a operação então utilizamos o Iterator para percorrer a lista e fazer essa operação

//        Exiba a média das notas
        System.out.println("Média: " + (soma /notas.size())); // O size retorna o tamanho da lista

//        Remova a nota 0
        notas.remove(0d); //Como estamos tratando de remover as notas, precisamos informar deixando explicito com "d" para que o método remova a nota e não o elemento da posição 0
        System.out.println("Removendo a nota 0: " + notas);

//        Remova as notas menores que 7 e exiba a lista:
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            var next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

//        Apague toda a lista
        notas.clear();
        System.out.println(notas);

//        Confira se a lista está vazia
        System.out.println("A lista está vazia? " + notas.isEmpty());
    }

}
