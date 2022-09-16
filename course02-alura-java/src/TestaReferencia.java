public class TestaReferencia {
    public static void main(String[] args) {
        var conta = new Conta(1000, 1, 2, "Rui");

        var conta2 = conta;

        System.out.println(conta);
        System.out.println(conta2);
        System.out.println("Modificacao na conta");
        conta.deposita(2000);
        System.out.println(conta);
        System.out.println(conta2);
    }
}
