package aula.lista;

import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;


public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas;


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.aulas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adicionaAula(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        //método sem stream
//        int tempoTotal = 0;
//        for (Aula aula: this.aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
        return this.aulas.stream()
                .mapToInt(Aula::getTempo)
                .sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                '}';
    }
}
