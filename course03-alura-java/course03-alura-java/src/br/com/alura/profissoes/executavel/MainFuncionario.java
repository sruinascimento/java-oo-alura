package br.com.alura.profissoes.executavel;

import br.com.alura.profissoes.classes.Gerente;

public class MainFuncionario {
    
    public static void main(String[] args) {
        Gerente f = new Gerente();
        System.out.println(f.autentica(124) ? "Autenticado": "Não autenticado");
    }



}
