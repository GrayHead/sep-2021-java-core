package lessons.lesson5.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
//        Properties properties = System.getProperties();
//        for (Object o : properties.keySet()) {
//            System.out.println(o);
//
//        }

//        String property = System.getProperty("user.home");
//        System.out.println(property);

        File file = new File(System.getProperty("user.home"));
        List<String> strings = Arrays.asList(Objects.requireNonNull(file.list()));
        System.out.println(strings);
        // C://Users/sszhu/foo?

//        File fooFolder = new File(System.getProperty("user.home") + File.separator + "foo");
//        fooFolder.mkdir();

//        File fooTxt = new File(System.getProperty("user.home") + File.separator + "foo" + File.separator + "foo.txt");
//        fooTxt.createNewFile();

//        File fooTxt = new File(System.getProperty("user.home") + File.separator + "foo" + File.separator + "foo.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(fooTxt, true);
//        String msg = "-hello world";
//        byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
//        fileOutputStream.write(bytes);
//
//        fileOutputStream.flush();
//        fileOutputStream.close();


//        File fooTxt = new File(System.getProperty("user.home") + File.separator + "foo" + File.separator + "foo.txt");
//        FileInputStream fileInputStream = new FileInputStream(fooTxt);
//
//        byte[] bytes = new byte[fileInputStream.available()];
//        fileInputStream.read(bytes);
//        fileInputStream.close();
//
////        System.out.println(bytes);
//        String msgInput = new String(bytes);
//        System.out.println(msgInput);

    }
}
