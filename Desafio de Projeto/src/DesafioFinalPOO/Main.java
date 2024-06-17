import Domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Tipos de Dados em Java");
        curso.setDescricao("Domine os tipos de dados em Java");
        curso.setCargaHoraria(10);

        curso1.setTitulo("Tipos de Dados em JavaScript");
        curso1.setDescricao("Domine os tipos de dados em JavaScript");
        curso1.setCargaHoraria(6);

        curso2.setTitulo("Tipos de Dados em C#");
        curso2.setDescricao("Domine os tipos de dados em C#");
        curso2.setCargaHoraria(8);

        mentoria.setTitulo("Revisando os tipos de dados em Java");
        mentoria.setDescricao("Revise e aplique na prática os tipos de dados em Java");
        mentoria.setDataMentoria(LocalDate.now());
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamps para Developers");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudoInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos Concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

    }

}
