public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        // try {
            metodo2();

        // } catch (Exception e) {
            // System.out.println(e.getMessage());
        // }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            // try {

                // System.out.println(i / 0);
            // } catch (ArithmeticException e) {
                // System.out.println(e.getMessage());
            // }
            
            // Conta cc = null;
            // cc.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}
