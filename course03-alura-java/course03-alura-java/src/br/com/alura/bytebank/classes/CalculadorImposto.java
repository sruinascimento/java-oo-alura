package br.com.alura.bytebank.classes;

public class CalculadorImposto {
    
    private double totalImposto;
    

    public void registra(Tributavel t) {
        double valor = t.getImposto();
        this.totalImposto += valor;
    }

    public double getImposto() {
        return 0;
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
