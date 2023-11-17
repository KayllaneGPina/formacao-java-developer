package PilaresPOO;

// Herança
public class Carro extends Veiculo{


    public void ligar() {
        // Conceito de encapsulamento
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }
}
