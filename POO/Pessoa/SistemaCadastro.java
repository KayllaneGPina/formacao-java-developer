package Pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("000.000.000-00", "Marcos");

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
