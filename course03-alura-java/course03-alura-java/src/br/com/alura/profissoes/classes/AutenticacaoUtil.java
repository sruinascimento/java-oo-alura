package br.com.alura.profissoes.classes;

public class AutenticacaoUtil {
    private int senha;

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
