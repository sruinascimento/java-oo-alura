public class TestaMinhaExcecaoChecked {
    
    public static void main(String[] args) {
        var c = new Conta();
        try {
            c.deposita();
        } catch (MinhaExcecao e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
