package aula.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainListaAula {

    public static void main(String[] args) {
        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(new Aula("POO", 60));
        aulas.add(new Aula("BD", 40));
        aulas.add(new Aula("REDES", 90));
        aulas.add(new Aula("LINUX", 45));

        System.out.println(aulas);

//        Collections.sort(aulas);
//        System.out.println("Ordenada");
//        System.out.println(aulas);

        System.out.println("Ordenando pelo tempo de aula");

//        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);



    }
}
