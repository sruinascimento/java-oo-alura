import java.io.*;

public class Writer {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("texto-escrita.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Oi eu sou o goku");
        bw.newLine();
        bw.write("oaksdhas");

        bw.close();


    }
}
