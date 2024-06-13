package com.EstruturaDeDados.PrincipaisImplementacoes.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Jão");
        aluno.put("Idade", "17");
        aluno.put("Media", "9.0");
        aluno.put("Turma", "3B");
        System.out.println(aluno);

        System.out.println(aluno.keySet()); //Retorna todas as chaves
        System.out.println(aluno.values()); //Retorna todos os valores

        List<Map<String, String>> listaAlunos = new ArrayList(); // Lista de alunos
        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "15");
        aluno2.put("Media", "9.8");
        aluno2.put("Turma", "2A");
        System.out.println(aluno2);

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome")); // Busca se na estrutura de dados existe a chave "Nome"
    }
}
