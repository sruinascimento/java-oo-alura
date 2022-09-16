package br.com.estruturadados.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MainOrdenaCLambda {
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

        /*
        * lambda para ajudar a ordenar pela idade
        * */
//        alunosEProfessores.sort((Pessoa o1, Pessoa o2) -> {
//                return Integer.compare(o2.getIdade(), o1.getIdade());
//            }
//        );

        //Como eu tenho somente uma linha, posso usar sem retorno e sem chaves
        alunosEProfessores.sort((Pessoa o1, Pessoa o2) -> Integer.compare(o2.getIdade(), o1.getIdade()));

        /**
         * Classe anônima para comparar os nomes
         */

//        Comparator<Pessoa> comparatorNome = (Pessoa p1, Pessoa p2) -> {
//            return  p1.getNome().compareTo(p2.getNome());
//        };

//        alunosEProfessores.sort(comparatorNome);



//        Collections.sort(alunosEProfessores); // Necessita que na classe seja implementado a interface Comparable e o método compareTo()
//        for (Pessoa a: alunosEProfessores) {
//            System.out.println(a);
//        }

        alunosEProfessores.forEach((pessoa) -> System.out.println(pessoa));
    }
}

