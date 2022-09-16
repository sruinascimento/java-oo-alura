package aula.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainOrdenacao {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Faca", 12));
        produtos.add(new Produto("Garfo", 42));
        produtos.add(new Produto("Colher", 1));
        System.out.println("Antes de ordenar\n" + produtos);
        //Formas de ordenar
        //Utilizando uma classe que  implementa a interface Comparator
//        Collections.sort(produtos, new OrdenaPorNome());


        //Utilizando uma classe anônima
//        Collections.sort(produtos, new Comparator<Produto>() {
//            @Override
//            public int compare(Produto o1, Produto o2) {
//                return Integer.compare(o1.getId(), o2.getId());
//            }
//        });
//

        //utilizando lamda
//        produtos.sort((Produto p1, Produto p2) -> Integer.compare(p1.getId(), p2.getId()));


        //Utilizando o Comparator.comparing
//        produtos.sort(Comparator.comparing(Produto::getNome));

        //Ordenando só com a lista pois a interface comprable já foi implementada.
        Collections.sort(produtos);
        System.out.println("Após ordenar\n"+produtos);




    }
}

class OrdenaPorNome implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
