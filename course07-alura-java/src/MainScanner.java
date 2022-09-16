import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia   = linhaScanner.nextInt();
            int conta     = linhaScanner.nextInt();
            String nome      = linhaScanner.next();
            double saldo     = linhaScanner.nextDouble();

//            System.out.println("{tipo de conta= " + tipoConta+", agencia= " + agencia + " conta= " + conta + " nome= " + nome + " saldo= " + saldo + "}");
//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));

            System.out.printf(new Locale("pt", "BR"),"tipo de conta = %s, agencia = %04d, conta = %08d, nome = %s, saldo = RS %.2f%n",tipoConta, agencia, conta, nome, saldo);

        }

        scanner.close();
    }
}
