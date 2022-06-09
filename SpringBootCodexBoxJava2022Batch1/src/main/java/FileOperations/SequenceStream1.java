package FileOperations;

import java.io.*;

public class SequenceStream1 {
    public void inputOutputOperations() {
        try {

            FileInputStream fis = new FileInputStream("abc.txt");
            FileInputStream fis1 = new FileInputStream("jani.txt");
            FileOutputStream fos = new FileOutputStream("xyz.txt");
            SequenceInputStream sis = new SequenceInputStream(fis, fis1);
            int s;
            while((s=sis.read())!=-1) {
                fos.write(s);
            }
            fis.close();
            fis1.close();
            fos.close();
            sis.close();
        } catch (FileNotFoundException e) {
            System.out.println("my sequence files");
        }catch (IOException e){
            System.out.println("ordered sequence files");
        }


    }
}
