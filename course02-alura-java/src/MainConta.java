public class MainConta {
    public static void main(String[] args) {
        var contaRui = new Conta(1000,12, 1234, "Rui" );
        // System.out.println(conta);

        // boolean conseguiSacar = conta.saca(100);
        // System.out.println(conseguiSacar);
        var contaNara = new Conta(0, 12, 12345, "Nara");

        boolean transferenciaRealizada = contaRui.transfere(-1, contaNara);
        if (transferenciaRealizada) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência não REALIZADA!");
        }
        System.out.println(contaRui);
        System.out.println(contaNara);

    }
}
