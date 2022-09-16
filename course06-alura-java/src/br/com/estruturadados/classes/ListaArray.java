package br.com.estruturadados.classes;

import java.util.ArrayList;

public class ListaArray {

    public static void main(String[] args) {
        ArrayList nomes = new ArrayList<>();
        nomes.add("Rui");
        nomes.add("Nara");
        nomes.add(1);
        System.out.println(nomes.size());

        for (Object obj:
             nomes) {
            System.out.println(obj);
        }

//        nomes.remove(3);
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i) );
        }

        System.out.print("Nome: " +  nomes.get(0) + " ");
        System.out.println(nomes.contains("Rui")? "Existe": "Não existe");
    }
}
