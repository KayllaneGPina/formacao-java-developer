package Map;

import java.util.*;

public class ExemploMap {

    /*Dado os modelos de carros e seus respectivos consumos na estrada faça:
    * modelo = gol - consumo = 14,4km/l
    * modelo = uno - consumo = 15,6km/l
    * modelo = mobi - consumo = 16,1km/l
    * modelo = hb20 - consumo = 14,5km/l
    * modelo = kwid - consumo = 15,6km/l
    * */

    public static void main(String[] args) {

        // Formas de inicializar um Map
//        Map carrosPopulares2020 = new HashMap(); -> Antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); -> Generics(jdk 5) - Diamonds Operator
//        HashMap<String, Date> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares); // Armazena de maneira aleatória

        System.out.println("Substitua o consumo do por 15,2km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

//        System.out.println("Exiba o terceiro modelo adicionado: "); -> Assim como no set não é possível vermos os elementos através de index

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

        System.out.println("Exiba os consumos dos carros: " + carrosPopulares.values());

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        var consumoEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>>  entries = carrosPopulares.entrySet();
        var modeloMaisEconomico = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoEconomico))  modeloMaisEconomico = entry.getKey();
        }
        System.out.println("Modelo: " + modeloMaisEconomico + " - " + "Consumo: " + consumoEconomico);

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        var consumoMenosEconomico = Collections.min(carrosPopulares.values());
        var modeloMenosEconomico = "";

        for (Map.Entry<String, Double> entry1: carrosPopulares.entrySet()) {
            if (entry1.getValue().equals(consumoMenosEconomico))  modeloMenosEconomico = entry1.getKey();
        }
        System.out.println("Modelo: " + modeloMenosEconomico + " - " + "Consumo: " + consumoMenosEconomico);


        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        var soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicionarios de carros: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2); // Ordena alfabeticamente

        System.out.println("Apague o conjunto de carros");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionario está vazio: " + carrosPopulares.isEmpty());
    }

}
