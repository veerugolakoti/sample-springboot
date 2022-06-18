package feature_ranjan.fileiooperation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStreamExample {
    public void bufferInput(){
        try {
            FileInputStream fileInputStream = new FileInputStream("smruti.txt");
            BufferedInputStream bufferInputStream = new BufferedInputStream(fileInputStream);
            int i;
            while((i = bufferInputStream.read()) != -1) {
                System.out.println("ASCII value : "+i);
                System.out.println("character   : "+(char)i);
            }
        }catch (IOException e) {
            System.out.println(e);
        }

    }
}

