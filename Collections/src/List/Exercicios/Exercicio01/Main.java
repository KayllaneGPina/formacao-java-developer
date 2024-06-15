package List.Exercicios.Exercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    /* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
    Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
    mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
    */

    public static void main(String[] args) {

        List<MesesDoAno> mesesDoAno = new ArrayList<>() {{
            add(new MesesDoAno(1, "Janeiro", 25));
            add(new MesesDoAno(2, "Fevereiro", 30));
            add(new MesesDoAno(3, "Março", 32));
            add(new MesesDoAno(4, "Abril", 27));
            add(new MesesDoAno(5, "Maio", 35));
            add(new MesesDoAno(6, "Junho", 31));
        }};

        System.out.print("Calcule a média semestral das temperaturas: ");
        Iterator<MesesDoAno> iterator = mesesDoAno.iterator();
        var soma = 0;
        while (iterator.hasNext()) {
            var next = iterator.next().getMediaTemperatura();
            soma += next;
        }
        System.out.println((soma / mesesDoAno.size()));

        System.out.println("Meses em que a temperatura estão acima da média: ");
        var media = 30;
        for (MesesDoAno meses : mesesDoAno) {
            if (meses.getMediaTemperatura() > media) {
                System.out.println(meses.getNumeroDoMes() + " - " + meses.getMes());
            }
        }
    }
}
