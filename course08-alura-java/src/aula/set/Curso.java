package aula.set;

import java.util.*;


public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas;
    private Set<Aluno> alunos;
    private Map<Integer, Aluno> matricula;


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.aulas = new ArrayList<>();
        this.alunos = new HashSet<>();
        this.matricula = new HashMap<>();
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

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matricula.put(aluno.getNumeroMatricula(), aluno);
    }

    public Map<Integer, Aluno> getMatricula() {
        return Collections.unmodifiableMap(matricula);
    }

    public Aluno buscaAlunoPelaMatricula(int matricula) {
        return this.matricula.get(matricula);
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

    public boolean alunoMatriculado(Aluno a1) {
        return  this.alunos.contains(a1);
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                ", alunos=" + alunos +
                '}';
    }
}
