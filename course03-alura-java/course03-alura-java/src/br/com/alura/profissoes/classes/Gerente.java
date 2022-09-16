package br.com.alura.profissoes.classes;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
 

    public double getBonificacao() {
        System.out.println("Bonificação do Gerente");
        return super.getSalario();
    }

    public int getSenha() {
        return this.senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }



 
}
