package aula.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCurso {
    public static void main(String[] args) {
        var curso = new Curso("Collections Java", "Paulo");
        System.out.println(curso.getAulas());

//        List<Aula> aula = curso.getAulas();
//        aula.add(new Aula("Aprendendo sobre lista imutaveis", 21));
//        aula.add(new Aula("Aprendendo sobre o java 8", 60));
//        aula.add(new Aula("Roadmap Back-end Java", 240));
//        aula.clear();
        curso.adicionaAula(new Aula("Aprendendo sobre lista imutaveis", 21));
        curso.adicionaAula(new Aula("Roadmap Back-end Java", 240));
        curso.adicionaAula(new Aula("Aprendendo sobre o java 8", 60));
        System.out.println(curso.getAulas());

        //Criando um lista a partir da imutavel
        List<Aula> aulas = new ArrayList<>(curso.getAulas());
//        aulas.sort((Aula a1, Aula a2) -> a1.getTitulo().compareTo(a2.getTitulo()));
//        aulas.sort(Comparator.comparing(Aula::getTempo));
//        Collections.reverse(aulas);
//        System.out.println("Reverse\n" + aulas);

        System.out.println(curso.getTempoTotal());

        System.out.println(curso);


    }
}
