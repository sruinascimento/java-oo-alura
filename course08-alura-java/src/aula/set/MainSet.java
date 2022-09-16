package aula.set;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rui");
        alunos.add("Rui");
        alunos.add("Nara");
        alunos.add("Lois");
        System.out.println(alunos);
        System.out.println(alunos.size());
        System.out.println(alunos.contains("Rui"));

        alunos.forEach(aluno -> System.out.printf("aluno -> %s ->",aluno));
    }
}
