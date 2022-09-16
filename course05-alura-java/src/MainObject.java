public class MainObject {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println("x");
        System.out.println(false);

        String nome = "Rui";
        System.out.println(nome.getClass().getName());
    }


    public static void print(String x) {
        System.out.println(x);
    }
    public static void print(boolean x) {
        System.out.println(x);
    }
    public static void print(int x) {
        System.out.println(x);
    }
}
