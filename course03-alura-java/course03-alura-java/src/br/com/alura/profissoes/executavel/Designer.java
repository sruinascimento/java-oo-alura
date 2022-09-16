package br.com.alura.profissoes.executavel;

import br.com.alura.profissoes.classes.Funcionario;




public class Designer extends Funcionario {
    
    public double getBonificacao() {
        return super.getSalario() * 0.1;
    }
}
