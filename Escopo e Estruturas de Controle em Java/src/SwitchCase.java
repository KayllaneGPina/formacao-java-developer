public class SwitchCase {
    public static void main(String[] args) {
//        Utilizando o Switch Case
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("IDEFINIDO");
                break;
        }
    }
}
