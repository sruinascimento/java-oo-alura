package br.com.alura.profissoes.executavel;

import br.com.alura.profissoes.classes.*;

public class MainGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Rui");
        g1.setSalario(1000);

        Funcionario g2 = new Gerente();
        g2.setNome("Ploop");
        g2.setSalario(500);

        EditorVideo editor = new EditorVideo();
        editor.setSalario(300);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(g2);
        controle.registra(editor);

        System.out.println(controle.getSoma());

        Funcionario f = new Gerente();
        f.getBonificacao();


    }
}
