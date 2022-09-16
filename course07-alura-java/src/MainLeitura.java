import java.io.*;
import java.util.Scanner;

public class MainLeitura {
    public static void main(String[] args) throws IOException {
        /**
         * FileInputStram é o fluxo em dados binários
         * InputStreamReader transformando em caractere
         *
         */
        InputStream fis = new FileInputStream("texto.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

//        Scanner sc = new Scanner(new File("texto.txt"));
//
//        while (sc.hasNext()) {
//            System.out.println(sc.nextLine());
//        }
    }
}
