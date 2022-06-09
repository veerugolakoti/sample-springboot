package FileOperations;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharReader {
    public void inputOutputOperations() {
        char[] arr={'n','a','g','a','r','j','u','n','a'};
        try {
            CharArrayReader car = new CharArrayReader(arr);
           int i;
           while((i=car.read())!=-1) {
               char c=(char)i;
               System.out.println(c + ":" +i);
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}