package PilaresPOO.Introducao;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("86345");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("2365");
        z400.ligar();

    }
}
