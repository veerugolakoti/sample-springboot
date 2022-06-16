package fileinputoutputstream;

import java.io.FileInputStream;

public class FileOutputStreamExample {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("xyz.txt");
            int i = fin.read();
            System.out.print((char) i);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);


        }
    }
}