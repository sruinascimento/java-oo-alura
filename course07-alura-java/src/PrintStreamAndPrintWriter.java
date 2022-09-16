import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class PrintStreamAndPrintWriter {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
//        PrintStream ps = new PrintStream("file-printstream.txt");
//        ps.println("Aprendendo printstream");
//        ps.println();
//        ps.println("final do arquivo");
//
//        ps.close();

        PrintWriter pw = new PrintWriter("file-printwriter.txt", "UTF-8");
        pw.println("Aprendendo PrintWriter");
        pw.println("final do printwriter");
        pw.close();
    }

}
