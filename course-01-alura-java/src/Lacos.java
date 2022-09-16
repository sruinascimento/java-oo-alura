public class Lacos {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(9*i);
        }

        int i = 1;
        while (i < 11) {
            System.out.println(10*i);
            i++;
        }

        for (int j = 0; j < 4; j++) {
            if (j > 2) break;
            for (int k = 0; k < 4; k++) {
                if (j == k) {
                    System.out.println(j+", "+k);
                }
            }
            System.out.println();
        }
    }

}
