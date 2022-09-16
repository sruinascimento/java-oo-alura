package br.com.estruturadados.classes;

import java.util.*;


public class MainOrdena {
    public static void main(String[] args) {
        Professor professor = new Professor("Nara", 30);
        Aluno aluno = new Aluno("Rui", 25);
        Aluno aluno2 = new Aluno("Lois", 4);
        Aluno aluno3 = new Aluno("Misha", 34);
        Aluno aluno4 = new Aluno("Princesa", 2);
        Aluno aluno5 = new Aluno("Ploop",12 );

        List<Pessoa> alunosEProfessores = new ArrayList<Pessoa>();
        alunosEProfessores.add(professor);
        alunosEProfessores.add(aluno2);
        alunosEProfessores.add(aluno);
        alunosEProfessores.add(aluno3);
        alunosEProfessores.add(aluno4);
        alunosEProfessores.add(aluno5);
//        for (Aluno a:
//             alunos) {
//            System.out.println(a);
//        }
//        System.out.println("\n\nApos a ordenação\n\n");
////        alunos.sort(new IdadeComparator());
//        alunos.sort(new NomeComparator());
//        for (Aluno a:
//             alunos) {
//            System.out.println(a);
//        }

        Collections.sort(alunosEProfessores); // Necessita que na classe seja implementado a interface Comparable e o método compareTo()
        for (Pessoa a: alunosEProfessores) {
            System.out.println(a);
        }
    }
}

class IdadeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
//        if (p1.getIdade() < p2.getIdade()) return -1;
//        if (p1.getIdade() > p2.getIdade()) return 1;
//        return 0;
//        return p1.getIdade() - p2.getIdade();
        // se p1 for menor, irá devolver negativo, se for maior, irá devolver positivo, se forem iguais, devolverá 0
        return Integer.compare(p1.getIdade(), p2.getIdade());
    }
}

class NomeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

