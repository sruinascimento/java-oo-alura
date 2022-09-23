import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaString {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Oi");
        palavras.add("Sou");
        palavras.add("O");
        palavras.add("Goku!");

//        Collections.sort(palavras);
        Collections.sort(palavras, new ComparadorPorTamanho());
//        System.out.println(palavras);

        //novo método de foreach

//        palavras.forEach(new ImprimeNaLinha());

//        palavras.forEach(s -> System.out.println(s));

//        palavras.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
        Function<String, Integer> comp = String::length;
        Function<String, Integer> comp2 = s -> s.length();
//        palavras.sort(Comparator.comparing(String::length));
        palavras.sort(Comparator.comparing(comp));
//        System.out.println(palavras);
        palavras.forEach(System.out::println);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }
}
