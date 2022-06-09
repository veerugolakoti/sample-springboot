package FileOperations;

import java.io.*;

public class FileReaderExample {
    public void inputOutputOperations()  {
       /* FileReader fr= null;
        try {
            fr = new FileReader("jani.txt");
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);

            }
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */
        try {
                FileWriter fw = new FileWriter("jani.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("datastage");
            bw.close();
        } catch (IOException e) {
            System.out.println("my exception");
        }


    }
}
