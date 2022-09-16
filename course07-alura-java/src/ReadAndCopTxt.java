import java.io.*;

public class ReadAndCopTxt {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("texto.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("texto-copiado.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();
        
        while (line != null) {
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }

        br.close();
        bw.close();
    }
}
