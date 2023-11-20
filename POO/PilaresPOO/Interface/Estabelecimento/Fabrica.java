package PilaresPOO.Interface.Estabelecimento;

import PilaresPOO.Interface.Equipamentos.Copiadora.Copiadora;
import PilaresPOO.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import PilaresPOO.Interface.Equipamentos.Digitalizadora.Scanner;
import PilaresPOO.Interface.Equipamentos.Impressora.Impressora;
import PilaresPOO.Interface.Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();
        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
