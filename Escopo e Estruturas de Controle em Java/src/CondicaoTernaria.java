public class CondicaoTernaria {
    public static void main(String[] args) {
        // Utilizando operadores ternarios
        int nota = 2;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 7 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
