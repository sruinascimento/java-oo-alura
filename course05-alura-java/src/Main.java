public class Main {

    public static void main(String[] args) {
        String nome = "Rui da Silva Nascimento";
        System.out.println("Strings são imutáveis");
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.replace("a", "@"));
        System.out.println(nome.charAt(2));
        System.out.println(nome.indexOf("ui"));
        System.out.println(nome.substring(4));

        for (int i=0; i<nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        System.out.println(nome.isBlank()? "Branco": "Não branco");
        System.out.println(nome.isEmpty()? "Vazio": "Não vazio");
        System.out.println("Nome comtem ui " + nome.contains("ui"));
        System.out.println();
        System.out.println(nome);

        char letter = 'o';
        System.out.println(letter);



    }
}
