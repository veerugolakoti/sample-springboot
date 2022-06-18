package FileOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutput {
    public void inputOutputOperations() throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("abc.txt");
        try {
            String s="welcome to kurnool";
            byte[] b=s.getBytes();
            fos.write(95);
            fos.write(b);
            fos.close();
            System.out.println("print single character");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
