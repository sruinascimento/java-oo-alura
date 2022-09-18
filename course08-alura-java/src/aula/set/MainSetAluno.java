package aula.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainSetAluno {
    public static void main(String[] args) {
        Curso curso = new Curso("Java _ Back", "Ploop");

        var rui = new Aluno("Rui", 1);
        curso.matricula(rui);
        curso.matricula(rui);
        curso.matricula(new Aluno("Rui", 1));
        curso.matricula(new Aluno("Rui", 1));
        curso.matricula(new Aluno("Xap", 1));
        curso.matricula(new Aluno("Javinha", 2));
        curso.matricula(new Aluno("PyPy", 3));
        System.out.println("Size: " + curso.getAlunos().size());
//        System.out.println(curso);

            //forma antiga de iterar
//        Set<Aluno> alunos = new HashSet<>(curso.getAlunos());
//        Iterator<Aluno> iterator = alunos.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println(curso.buscaAlunoPelaMatricula(10));



        System.out.println(curso.alunoMatriculado(new Aluno("Rui", 1))? "Matriculado" : "Não Matriculado");
    }
}
