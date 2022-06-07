package fileInputStream;

import java.io.BufferedReader;

public class FileInputStreamEXamples {
    public void testfileinputmethods(){
        FileInputStreamEXamples InputStream = new  FileInputStreamEXamples();
        try {
            InputStream.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("file not exceptijon");
        }

        System.out.println( InputStream.equals("java"));
        System.out.println( InputStream.toString());





    }


}

