package FileOperations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.Vector;

public class StrReader {
    public void inputOutputOperations() {
        try {
            String str = "Stream is a sequence data";
//            String str1 = "representational state transfer";
            StringReader sr = new StringReader(str);
//            StringReader sr1 = new StringReader(str1);
            /*Vector v=new Vector();
            v.add(sr);
            v.add(sr1);
            Enumeration e=v.elements();
            SequenceInputStream sis=new SequenceInputStream(e);*/
            int i=0;
            while((i=sr.read())!=-1){
                System.out.print((char)i);
            }
            sr.close();
           /* sr1.close();
            sis.close();*/

        } catch (IOException b){
            System.out.println("my exception");
        }
    }
}