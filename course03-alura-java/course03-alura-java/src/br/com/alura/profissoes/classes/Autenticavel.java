package br.com.alura.profissoes.classes;

public abstract interface Autenticavel {
    
    public abstract int getSenha() ;
    public abstract void setSenha(int senha) ;
    public abstract boolean autentica(int senha) ;

}