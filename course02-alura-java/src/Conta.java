public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private String titular;


    public Conta(double saldo, int agencia, int numero, String titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString(){
        return "##### Conta #####\n" +
                "Agência: " + this.agencia + "\n" +
                "Número: " + this.numero + "\n" +
                "Titular: " + this.titular + "\n" +
                "Saldo: RS " + this.saldo + "\n";
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    private void realizaSaque(double valor) {
        this.saldo -= valor;
    }

    public boolean saca(double valor) {
        if (!this.temSaldo(valor)) {
            return false;
        }
        this.realizaSaque(valor);
        return true;
    }

    private boolean temSaldo(double valor) {
        return valor <= this.saldo && valor > 0;
    }

    public boolean transfere(double valor, Conta contaDestino) {
        if (!this.temSaldo(valor)) {
            return false;
        }

        this.realizaSaque(valor);
        contaDestino.deposita(valor);
        return true;
    }
}
