package com.codexbox.springboot.app.sohailspringbootproject.fileoperations;

import java.io.*;

public class InputOutputStreamOperations {
    public void ioOperations(){
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("xyz.txt");
            outputStream = new FileOutputStream("abc.txt");

            int ascii=0;
            while(ascii!=-1){
                ascii =inputStream.read();
                outputStream.write(ascii);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}






