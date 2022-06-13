package com.codexbox.springboot.app.dinesh202270;

import java.io.*;
import java.nio.Buffer;
import java.nio.CharBuffer;

public class FileReaderClass {

   public void inputOutputStream() throws IOException {
       InputStream inputStream = null;
       OutputStream outputStream = null;
        try {
         inputStream=new FileInputStream("abc.txt");

           outputStream = new FileOutputStream("xyz.txt");

            int temp=0;
            while(temp!=-1)
            {
                temp=inputStream.read();
                outputStream.write(temp);

            }
        } catch (FileNotFoundException e) {
            System.out.println("file is not found... ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        finally {
            inputStream.close();
            outputStream.close();
        }


    }


}
