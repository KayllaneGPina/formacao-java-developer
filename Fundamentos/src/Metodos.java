public class Metodos {
    public static void main(String[] args) {
        /*Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.*/

        /*Critério de nomeação de Métodos
        * Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:
        * - Deve ser nomeado como verbo;
        * Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).
        * Exemplos:
        somar(int n1, int n2){}

        abrirConexao(){}

        concluirProcessamento() {}

        findById(int id){} -

        calcularImprimir(){} - Há algo de errado neste método, ele deveria ter uma única finalidade

         */

        // Obs.: ATENÇÃO! Não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.

    }

    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return num1 + num2 ;
    }

    // este método não pode ser visto por outras classes no projeto
    private void metodoPrivado(){}

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)
    }
    public void calcularEnviar(){
        //um método deve representar uma única responsabilidade
    }
    public void gravarCliente(String nome, String cpf, Integer telefone){
        //este método tem a finalidade de gravar
        //informações de um cliente, por que não criar
        //um objeto cliente e passar como parâmetro ?
        //veja abaixo
    }
    /*public void gravarCliente(Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}*/
}
