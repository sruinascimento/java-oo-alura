package aula.ordenacao;

public class Produto implements Comparable<Produto> {

    private String nome;
    private int id;

    public Produto(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Produto p1) {
        return this.nome.compareTo(p1.getNome());
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
