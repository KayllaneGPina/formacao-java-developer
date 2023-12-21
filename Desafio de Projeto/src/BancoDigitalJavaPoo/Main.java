package BancoDigitalJavaPoo;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Kayllane");
        cliente1.setIdade(21);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setIdade(30);

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.depositar(500);
        cc.imprimirExtrato();

        cc.transferir(100, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }



}
