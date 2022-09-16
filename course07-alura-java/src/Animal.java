import java.io.Serializable;

public class Animal implements Serializable {
    private static final long serialVersionUID = 6749395820400425264L;
    private String nome;
    private int quantidadeDePatas;

    public Animal(String nome, int quantidadeDePatas) {
        this.nome = nome;
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", quantidadeDePatas=" + quantidadeDePatas +
                '}';
    }
}
