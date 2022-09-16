package br.com.alura.bytebank.classes;

public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException (String msg) {
        super(msg);
    }

}
