package br.com.alura.profissoes.classes;

public class Administrador extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticacaoUtil();
    }


    public int getSenha() {
        // TODO Auto-generated method stub
        return this.autenticador.getSenha();
    }

    public void setSenha(int senha) {
        // TODO Auto-generated method stub
        this.autenticador.setSenha(senha);
        
    }

    public boolean autentica(int senha) {
        // TODO Auto-generated method stub
        return this.autenticador.autentica(senha);
    }

    public double getBonificacao() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    // private int senha;

    // @Override
    // public double getBonificacao() {
    //     System.out.println("Bonificação do Administrador");
    //     return 50;
    // }

    // @Override
    // public int getSenha() {
    //     return this.senha;
    // }

    // @Override
    // public void setSenha(int senha) {
    //     this.senha = senha;
    // }

    // @Override
    // public boolean autentica(int senha) {
    //     return this.senha == senha;
    // }

    
}
