public class Operadores {
    public static void main(String[] args) {
        /*Símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.
         ==
         !=
         <
         >
         <=
         >=
         +
         -
         *
         /
         (**)
         %
         ++
         --
         &&
         ||
         */

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);

        // Operadores Lógicos - Lembrar da Tabela Verdade
        boolean condicao1=true;

        boolean condicao2=false;
        if(condicao1 && condicao2) {
            System.out.print("Os dois valores precisam ser verdadeiros");
        } else {
            System.out.println("Senão retorna falso");
        }
    }
}
