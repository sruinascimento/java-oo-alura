import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {

    public static void main(String[] args) {

        try {
//            FileWriter fw = new FileWriter("lfw.txt");
//            fw.write("Aprendendo FileWriter");
//            fw.write(System.lineSeparator());
//            fw.write("Dia triste");
//            fw.write(System.lineSeparator());
//
//            fw.close();


            BufferedWriter bw = new BufferedWriter(new FileWriter("learning-file-writer.txt"));
            bw.write("Aprendendo FileWriter");
            bw.newLine();
            bw.write("Dia triste");
            bw.newLine();

            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
