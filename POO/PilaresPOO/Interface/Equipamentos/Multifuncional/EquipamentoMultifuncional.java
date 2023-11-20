package PilaresPOO.Interface.Equipamentos.Multifuncional;

import PilaresPOO.Interface.Equipamentos.Copiadora.Copiadora;
import PilaresPOO.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import PilaresPOO.Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar(){
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
