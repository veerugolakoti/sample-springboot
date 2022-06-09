package FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileSingleCharacter {
    public void inputOutputOperations() {
        try {
            FileInputStream fis=new FileInputStream("jani.txt");
//            int r = fis.read();
            int r=0;
            while((r= fis.read())!=-1) {
                System.out.print((char)r);
            }
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
