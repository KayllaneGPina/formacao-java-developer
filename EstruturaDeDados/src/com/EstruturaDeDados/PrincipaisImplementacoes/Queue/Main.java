package com.EstruturaDeDados.PrincipaisImplementacoes.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Fila de carros
        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("Chervrolet"));
        queueCarro.add(new Carro("Fiat"));

        System.out.println(queueCarro.add(new Carro("Peugeot"))); // Retorna se consegui adicionar ou não o novo elemento na fila
        System.out.println(queueCarro);

        System.out.println(queueCarro.offer(new Carro("Renault"))); //  Ele tenta adicionar o elemento na lista porém a diferença é que o add retorna erro caso não consiga adicionar o elemento na fila, o offer apenas retorna true ou false

        System.out.println(queueCarro.peek()); // Retorna o primeiro elemento da fila
        System.out.println(queueCarro);
        System.out.println(queueCarro.poll()); // Retorna o primeiro elementa da fila e o remove
        System.out.println(queueCarro);

        System.out.println(queueCarro.isEmpty()); // Retorna se a fila está vazia ou não
        System.out.println(queueCarro.size()); // Retorna o tamanho da fila
    }
}
