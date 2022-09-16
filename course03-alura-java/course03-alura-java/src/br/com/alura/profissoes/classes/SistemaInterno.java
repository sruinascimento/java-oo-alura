package br.com.alura.profissoes.classes;

public class SistemaInterno {
    
    private int senha = 2022;

    public void autentica(Autenticavel funcionario) {
        boolean gerenteAutenticado = funcionario.autentica(this.senha);
        System.out.println(gerenteAutenticado? "Pode acessar o sistema": "Não pode acessar o sistema");
    }
}
