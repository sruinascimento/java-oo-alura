package br.com.alura.bytebank.executavel;


import br.com.alura.bytebank.classes.ContaCorrente;
import br.com.alura.bytebank.classes.ContaPoupanca;
import br.com.alura.bytebank.classes.SaldoInsuficienteException;

public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 123);
        ContaPoupanca cp = new ContaPoupanca(1, 234);


        cc.deposita(100);

        try {
            cc.transfere(2, cp);
        } catch (SaldoInsuficienteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
