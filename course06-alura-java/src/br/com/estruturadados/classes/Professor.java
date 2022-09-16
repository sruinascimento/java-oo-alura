package br.com.estruturadados.classes;

public class Professor extends Pessoa {
    String turmas;
    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public String getTurmas() {
        return turmas;
    }

    public void setTurmas(String turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + super.getNome() + '\'' +
                "idade="+ super.getIdade() +
                "turmas='" + turmas + '\'' +
                '}';
    }
}
