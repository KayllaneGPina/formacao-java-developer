package anatomiaDasClasses;

// Classe
public class Main {
    // Método 1
    public static void main(String[] args) {
        String primeiroNome = "Kayllane";
        String segundoNome = "Pina";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    //Método 2
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}