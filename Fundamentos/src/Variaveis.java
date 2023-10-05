public class Variaveis {
    public static void main(String[] args) {
        /*Tipos Primitivos
         * int
         * byte
         * short
         * long
         * float
         * double
         * boolean
         * char
         */

    /*Declaração de Variáveis
    *Variável, é uma identificação de um espaço em memória, utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.
    A estrutura padrão para se declarar uma variável sempre é: <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
    Exemplos abaixo: */
        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

    /*Variáveis e Constantes
    * Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado, define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.
    * Já as Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada final, seguida do tipo.
    Por convenção, Constantes são sempre escritas em CAIXA ALTA.*/

        // Variavel
        int numero = 10;
        numero = 20;
        System.out.println(numero);

        //Constantes
        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 3.16 - Esta linha vai apresentar erro de compilação!

        System.out.println(VALOR_DE_PI);
    }
}
