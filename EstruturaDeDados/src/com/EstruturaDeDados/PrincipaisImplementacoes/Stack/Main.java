package com.EstruturaDeDados.PrincipaisImplementacoes.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Pilha de carros
      Stack<Carro> stackCarro = new Stack<>();

      stackCarro.push(new Carro("Ford"));
      stackCarro.push(new Carro("Chevrolet"));
      stackCarro.push(new Carro("Fiat"));

        System.out.println(stackCarro);
        System.out.println(stackCarro.pop()); // Retorna o último elemento da pilha (Last In First Out - FIFO)
        System.out.println(stackCarro);

        System.out.println(stackCarro.peek()); // Apenas retorna o último elemento da pilha mas não o remove
        System.out.println(stackCarro);

        System.out.println(stackCarro.empty()); // Retorna se a pilha está vazia ou não

    }
}
