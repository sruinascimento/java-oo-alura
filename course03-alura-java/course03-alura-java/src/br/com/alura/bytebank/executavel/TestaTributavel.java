package br.com.alura.bytebank.executavel;

import br.com.alura.bytebank.classes.CalculadorImposto;
import br.com.alura.bytebank.classes.ContaCorrente;
import br.com.alura.bytebank.classes.SeguroVida;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2222, 23456);
        cc.deposita(100);

        SeguroVida sg = new SeguroVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.registra(sg);
        ci.registra(cc);
        System.out.println(ci.getTotalImposto());
    }
}
