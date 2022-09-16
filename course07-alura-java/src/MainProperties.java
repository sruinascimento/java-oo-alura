import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MainProperties {
    public static void main(String[] args) throws IOException {
        //Escrevendo o arquivo
            Properties props =  new Properties();
//            props.setProperty("login", "alurinha");
//            props.setProperty("senha", "1234");
//            props.setProperty("endereco", "www.alura.com.br");
//            props.store(new FileWriter("confs.properties"), "Aprendendo sobre o Properties");

        //Lendo o arquivo
        props.load(new FileReader("confs.properties"));
        System.out.printf("login = %s%n", props.getProperty("login"));
        System.out.printf("senha = %s%n ", props.getProperty("senha"));
        System.out.printf("endereco = %s%n", props.getProperty("endereco"));
    }

}
