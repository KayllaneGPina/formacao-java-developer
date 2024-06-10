package Iphone;

import Iphone.AparelhosEletronicos.IAparelhoTelefonico;
import Iphone.AparelhosEletronicos.INavegadorDeInternet;
import Iphone.AparelhosEletronicos.IReprodutorMusical;

public class IPhone implements IAparelhoTelefonico, INavegadorDeInternet, IReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Telefone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página Web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo música");
    }
}
