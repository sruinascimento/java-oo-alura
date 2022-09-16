public class Condicional {
    public static void main(String[] args) {
        int idade = 18;

        if (idade < 18 && idade > 0) {
            System.out.println("Menor de idade");
            String escopoLocal = "local if";
        } else {
            System.out.println("Maior de idade");
        }

        switch (idade) {
            case 0:
                System.out.println("Invalida");
                break;
            default:
                System.out.println("default");

        }
    }
}
