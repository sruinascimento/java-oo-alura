public class Vetor {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "Rui";
        nomes[1] = "Nara";
        nomes[2] = "Lois";
        nomes[3] = "Misha";
        nomes[4] = "Princesa";

        for (String nome: nomes) {
            System.out.println(nome);
        }

        int[] idades = new int[10];

        System.out.println(idades.length);
    }
}
