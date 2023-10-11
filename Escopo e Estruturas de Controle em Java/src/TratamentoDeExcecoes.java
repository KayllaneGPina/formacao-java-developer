import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoDeExcecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");

        } catch (InputMismatchException e) { //É importante saber sobre as possíveis exceções para serem tratados corretamente
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }

    }
}
