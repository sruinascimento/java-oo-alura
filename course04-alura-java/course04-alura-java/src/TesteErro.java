public class TesteErro {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("CACA!!!!!");
        } finally {
            System.out.println("depois da caca");
        }
    }
}
