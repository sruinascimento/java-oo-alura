package br.com.estruturadados.executavel;

import br.com.estruturadados.classes.Aluno;
import br.com.estruturadados.classes.Pessoa;
import br.com.estruturadados.classes.Professor;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pessoa[] pessoasDaEscola = new Pessoa[4];

        var rui = new Aluno("Rui", 25);
        var nara = new Professor("Nara", 30);
        var outro = new Aluno("Rui", 25);
        pessoasDaEscola[0] = rui;
        pessoasDaEscola[1] = nara;

        Aluno refRui = (Aluno) pessoasDaEscola[0];
        Professor refNara = (Professor) pessoasDaEscola[1];

        System.out.println(refRui);
        System.out.println(refNara);

        System.out.println(rui.equals(outro));


        List<String> nomes = new LinkedList<>();

        nomes.add("Ploop");
        nomes.add("Javinha");

//        for (String nome: nomes) {
//            System.out.println(nome);
//        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
