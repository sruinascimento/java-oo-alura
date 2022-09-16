package br.com.estruturadados.classes;

public class Aluno extends Pessoa {
    String matricula;

    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + super.getNome() + '\'' +
                "idade="+ super.getIdade() +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
