package com.codexbox.springboot.app.ramdurgaprasad.assessment5;

import java.io.*;

public class BufferedStreams {
    public void  Bufferstream(){
        try {
            InputStream inputStream = new FileInputStream("rams.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            System.out.println("read"+bufferedInputStream.read());
            System.out.println("available"+bufferedInputStream.available());
           bufferedInputStream.mark(1);
            System.out.println("skip"+bufferedInputStream.skip(2));
            int i=0;


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
