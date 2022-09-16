package br.com.estruturadados.executavel;

import java.util.ArrayList;
import java.util.List;

public class TestaArgs {
    public static void main(String[] args) {
        System.out.println("### Testando Args ###");
        for (String arg: args) {
            System.out.println(arg);
        }
    }

}
