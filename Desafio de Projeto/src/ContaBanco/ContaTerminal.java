package ContaBanco;

import java.text.MessageFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente +"," + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +", já está disponível para saque.");
    }

}