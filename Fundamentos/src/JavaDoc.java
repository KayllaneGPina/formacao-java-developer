public class JavaDoc {
    /*
    Uma das maiores características da linguagem Java é que, desde suas primeiras versões, tínhamos em nossas mãos, uma documentação rica e detalhada dos recursos da linguagem.
    Conforme site oficial, podemos compreender e explorar, todos os recursos organizados por pacotes e classes bem específicas, sem nem mesmo escrever uma linha de código.
    Hoje, costuma-se afirmar que, para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender, a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.
     */

    public class Calculadora {
        /**
         * Este método é utilizado para somar dois números inteiros
         * @param numeroUm este é o primeiro parâmetro do método
         * @param numeroDois este é o segundo parâmetro do método
         * @return int o resultado deste método é a soma dos dois números.
         */
        public int somar(int numeroUm, int numeroDois) {
            return  numeroUm + numeroDois;
        }
    }

    /*
    Javadoc é um gerador de documentação criado pela Sun Microsystems , para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples, inseridas nos comentários do programa.
    Este sistema, é o padrão de documentação de classes em Java, onde muitas das IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.
    * */
}
