package aula.set;

import java.util.HashSet;
import java.util.Set;

public class MainSetAluno {
    public static void main(String[] args) {
        Curso curso = new Curso("Java _ Back", "Ploop");

        var rui = new Aluno("Rui", 1);
        curso.matricula(rui);
        curso.matricula(rui);
        curso.matricula(new Aluno("Rui", 1));
        curso.matricula(new Aluno("Nara", 2));
        curso.matricula(new Aluno("Lois", 3));
        System.out.println(curso.getAlunos().size());
        System.out.println(curso);

        System.out.println(curso.alunoMatriculado(new Aluno("Rui", 1))? "Matriculado" : "Não Matriculado");
    }
}
