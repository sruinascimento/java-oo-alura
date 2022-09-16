package br.com.estruturadados.executavel;

import java.util.List;
import java.util.ArrayList;

public class MainInteger {

    public static void main(String[] args) {
        Integer primitivoInt = Integer.valueOf(29); //referência
        System.out.println(primitivoInt.intValue()); //valor

        String numeroString = "12";

        System.out.println(numeroString.getClass().getName());
        System.out.println(Integer.parseInt(numeroString));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        int min = -2147483648;
        int max = 2147483647;

        List<Number> numeros = new ArrayList<>();
        numeros.add(25);
        numeros.add(23.5);
        numeros.add(89f);
    }
}
