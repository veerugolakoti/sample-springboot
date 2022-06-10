package feature_ranjan.fileiooperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream2 {
    public void sequenceInput(){
        try
        {
            FileInputStream fileInputStream1 = new FileInputStream("smruti.txt");
            FileInputStream fileInputStream2 = new FileInputStream("Ranjan.txt");
            FileInputStream fileInputStream3 = new FileInputStream("sethi.txt");
            Vector v = new Vector();
            v.add(fileInputStream1);
            v.add(fileInputStream2);
            v.add(fileInputStream3);
            Enumeration e = v.elements();
            SequenceInputStream sequenceInputStream = new SequenceInputStream(e);

            int a;
            while((a = sequenceInputStream.read()) != -1 ){
                System.out.print((char)a);
            }

        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
