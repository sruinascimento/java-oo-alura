import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class TesteUnicodeEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "CC";
        System.out.println(str.codePointAt(0));
        System.out.println(Charset.defaultCharset().displayName());
        System.out.println(Arrays.toString(str.getBytes("UTF-16")));

    }
}
