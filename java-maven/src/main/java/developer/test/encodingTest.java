package developer.test;

import java.nio.charset.Charset;

public class encodingTest {
    public static void main(String[] args) {
        System.out.println("한글이안나오네️");
        System.out.println(Runtime.version());
        System.out.println("Charset.defaultCharset(): " + Charset.defaultCharset());
        System.out.println("file.encoding property: " + System.getProperty("file.encoding"));
        System.out.println("native.encoding property: " + System.getProperty("native.encoding"));
        System.out.println("sun.jnu.encoding property: " + System.getProperty("sun.jnu.encoding"));
        System.out.println("stdout.encoding property: " + System.getProperty("stdout.encoding"));
        System.out.println("sun.stdout.encoding property: " + System.getProperty("sun.stdout.encoding"));

        if (System.console() != null) {
            System.out.println("systemConsole encoding: " + System.console().charset());
        }
    }
}
