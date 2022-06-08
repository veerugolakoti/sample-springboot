package com.codexbox.springboot.app.rehana.files;

import org.apache.logging.log4j.util.Strings;

import java.io.*;

public class FileInputoutputExample {
    public  void fileoperations() throws IOException {

        InputStream inputStream = null;
        InputStream inpstream = null;
        OutputStream  outputStream = null;
        try {
            inputStream = new FileInputStream("rehana.txt");
             inpstream = new FileInputStream("arha.txt");
             outputStream = new FileOutputStream("abcoutt.txt");
           // System.out.println(inputStream.read());
            int asci = 0;
            int f2 = 0;
            while (asci != -1) {
                asci = inputStream.read();
                outputStream.write(asci);
            }
                while (f2!=-1) {
                    f2 = inpstream.read();
                    outputStream.write(f2);
                }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            inputStream.close();
            inpstream.close();
            outputStream.close();


        }


    }
}
