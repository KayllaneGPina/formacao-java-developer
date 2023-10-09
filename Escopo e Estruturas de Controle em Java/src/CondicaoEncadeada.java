public class CondicaoEncadeada {
    public static void main(String[] args) {
        // Exemplo de um resultado escolar usando condicionais encadeadas
        double nota = 6.8;

        if(nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0 && nota < 7.0) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
