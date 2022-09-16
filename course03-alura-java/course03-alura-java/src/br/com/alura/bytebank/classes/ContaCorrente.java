package br.com.alura.bytebank.classes;

public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double descontoSaque = 0.2;
        double valorASerSacado = valor + descontoSaque;
        // TODO Auto-generated method stub
        super.saca(valorASerSacado);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getImposto() {
        // TODO Auto-generated method stub
        return super.saldo * 0.01;
    }
}
