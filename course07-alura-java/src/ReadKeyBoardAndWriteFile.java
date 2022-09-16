import java.io.*;

public class ReadKeyBoardAndWriteFile {
    public static void main(String[] args)  {

        try {

//            InputStream sc = System.in;
            InputStream sc = new FileInputStream("texto.txt");
            Reader isr = new InputStreamReader(sc, "UTF-8'");
            BufferedReader br = new BufferedReader(isr);

//            FileOutputStream fos = new FileOutputStream("texto-digitado.txt");
            OutputStream fos = System.out;
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            String line = br.readLine();

            while (line != null && !line.isEmpty()) {
                bw.write(line);
                bw.newLine();
//                bw.flush(); //método para ele escrever logo
                line = br.readLine();
            }

            br.close();
            bw.close();

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
