package com.EstruturaDeDados.PrincipaisImplementacoes.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Carro> hashSetCarro = new HashSet<>();

        hashSetCarro.add(new Carro("Ford"));
        hashSetCarro.add(new Carro("Chevrolet"));
        hashSetCarro.add(new Carro("Fiat"));
        hashSetCarro.add(new Carro("Peaugeot"));
        hashSetCarro.add(new Carro("Zip"));
        hashSetCarro.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarro); // O HashSet não segue uma ordem e retorna de maneira aleatória

        Set<Carro> treeSetCarro = new TreeSet<>();

        treeSetCarro.add(new Carro("Ford"));
        treeSetCarro.add(new Carro("Chevrolet"));
        treeSetCarro.add(new Carro("Fiat"));
        treeSetCarro.add(new Carro("Peaugeot"));
        treeSetCarro.add(new Carro("Zip"));
        treeSetCarro.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarro); // Retorna um erro porque precisa que a classe Carro implemente a interface Comparable já que essa estrutura de dados é baseado em árvores

    }
}
