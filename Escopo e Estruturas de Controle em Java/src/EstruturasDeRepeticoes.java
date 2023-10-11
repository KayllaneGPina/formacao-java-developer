import java.util.Random;

public class EstruturasDeRepeticoes {
    public static void main(String[] args) {
        //For
        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
        }

        // For em Array
        String alunos[] = {"João", "Maria", "Carlos", "Alfredo", "Aurora", "Luana"};

//        for (int i = 0; i < alunos.length; i++) {
//            System.out.println(alunos[i]);
//        }

        //Outra maneira de percorrer um array
        for (String aluno : alunos) {
//            System.out.println(aluno);
        }

        //Break e Continue
        for (int i = 1; i <= 5; i++) {
//            if (i == 3) break;
            if (i == 3) continue;
//            System.out.println(i);
        }

        // While
        int contador = 0;

        while (contador <= 10) {
//            System.out.println("O número atual é: " + contador);
            contador++;
        }

        // Do While
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando...");
        } while (tocando());

        System.out.println("Alô!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;

        System.out.println("Atendeu? " + atendeu);

        //Negar o ato de continuar atendendo
        return ! atendeu;
    }
}
