package FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceStream {
    public void inputOutputOperations() {
        try {
                FileInputStream fis = new FileInputStream("abc.txt");
            FileInputStream fis1 = new FileInputStream("jani.txt");
            SequenceInputStream sis = new SequenceInputStream(fis, fis1);
            int s;
            while((s=sis.read())!=-1) {
                System.out.print((char)s);
            }
            fis.close();
            fis1.close();
            sis.close();
        } catch (FileNotFoundException e) {
            System.out.println("my exception");
        }
        catch (IOException e){
            System.out.println();
        }


    }
}
