import java.util.ArrayList;

public class MainLista {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com curso e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

//        for (String aula:
//             aulas) {
//            System.out.println(aula);
//        }

//        System.out.println(aulas);

        //acessando através dos índices
        System.out.println(aulas.get(0));
        System.out.println(aulas.get(1));
        System.out.println(aulas.get(2));

        System.out.println("Tamanho da lista: " + aulas.size());

        //utilizando o foreach
        System.out.println("#### Foreach ####");
        aulas.forEach((String aula) -> {
            System.out.println(aula);
        });

    }
}
