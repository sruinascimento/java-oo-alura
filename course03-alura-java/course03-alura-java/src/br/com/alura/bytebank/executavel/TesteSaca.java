package br.com.alura.bytebank.executavel;

import br.com.alura.bytebank.classes.ContaCorrente;

public class TesteSaca {
    public static void main(String[] args) {
        var conta = new ContaCorrente(1, 123);
        conta.deposita(12);
        System.out.println(conta.getSaldo());
        try {
            conta.saca(112);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Continuou");
    }
}
