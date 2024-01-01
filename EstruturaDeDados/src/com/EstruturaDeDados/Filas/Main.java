package com.EstruturaDeDados.Filas;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");
//        minhaFila.enqueue(3);

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

    }
}
