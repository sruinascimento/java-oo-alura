import java.util.*;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //Ordenando pela quantidade de alunos
        cursos.sort(Comparator.comparing(Curso::getAlunos));


//        cursos.forEach(System.out::println);

        //filtrando os cursos que tem mais mais de 99 alunos
        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .map(curso -> curso.getAlunos())
                .forEach(totalAlunos -> System.out.println(totalAlunos));


        //Utilizando o method reference
        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        //ordenando os cursos pela quantidade de alunos
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.forEach(System.out::println);

//        Optional<Curso> optionalCurso = cursos.stream()
//                .filter(curso -> curso.getAlunos() >= 1000)
//                .findAny();
//
////        System.out.println(optionalCurso.orElse(null).getNome());
//            optionalCurso.ifPresent(System.out::println);

        System.out.println("Filtrando cursos com o nome que tenham mais de 2 caracteres no nome");
        cursos.stream()
                .filter(curso -> curso.getNome().length() > 2)
                .findAny()
                .ifPresent(System.out::println);

        //Criando uma coleção
        List<Curso> cursosComMaisDeCemAlunos = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toList());

        System.out.println("Cursos com mais de 100 alunos");
        cursosComMaisDeCemAlunos.forEach(System.out::println);

        //Calculando a soma de todos alunos
        int somaDeTodosAlunos = cursos.stream()
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(somaDeTodosAlunos);


        //Criando um map
//        Map<String, Integer> alunosPorCurso = cursos.stream()
//                .collect(Collectors.toMap(curso -> curso.getNome(), curso -> curso.getAlunos()));
        Map<String, Integer> alunosPorCurso = cursos.stream()
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos));
        System.out.println(alunosPorCurso);

        //Sem atribuir a uma coleção
        System.out.println("Sem atribuir a uma map");
        cursos.stream()
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
                .forEach((nomeCurso, quantidadeAlunos) -> System.out.println("curso: " + nomeCurso + " quantidade: " + quantidadeAlunos));

        OptionalDouble mediaQuantidadeAlunos = cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average();
        System.out.println(mediaQuantidadeAlunos.getAsDouble());
    }

}