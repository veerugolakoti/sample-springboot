package com.codexbox.springboot.app.sohailspringbootproject.fileoperations;

import java.io.*;

public class Combine2Files  {
    public void combineFiles(){
        {
            InputStream inputStream1 = null;
            InputStream inputStream2 = null;
            OutputStream outputStream = null;
            try {
                inputStream1 = new FileInputStream("xyz.txt");
                inputStream2 = new FileInputStream("abc.txt");
                outputStream = new FileOutputStream("newfile.txt");

                int ascii=0;
                int ascii1= 0;

                while(ascii!=-1){
                    ascii =inputStream1.read();
//                    ascii=inputStream2.read();
                    outputStream.write(ascii);
                }
                while(ascii1!=-1) {
                    ascii1 = inputStream2.read();
//                    ascii=inputStream2.read();
                    outputStream.write(ascii1);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    inputStream1.close();
                    inputStream2.close();
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
