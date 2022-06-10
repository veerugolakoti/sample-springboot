package FileOperations;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharWriter {
    public void inputOutputOperations() {
        try {

            CharArrayWriter caw = new CharArrayWriter();
            caw.write("iam a java developer");
            FileWriter fw=new FileWriter("pqr.txt");
            FileWriter fw1=new FileWriter("kkr.txt");
            FileWriter fw2=new FileWriter("bbn.txt");
            FileWriter fw3=new FileWriter("kcr.txt");
            caw.writeTo(fw);
            caw.writeTo(fw1);
            caw.writeTo(fw2);
            caw.writeTo(fw3);
            fw.close();
            fw1.close();
            fw2.close();
            fw3.close();
        }catch (IOException e){
            System.out.println("my exception");
        }
    }
}