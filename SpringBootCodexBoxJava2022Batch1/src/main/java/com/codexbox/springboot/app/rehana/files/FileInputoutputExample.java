package com.codexbox.springboot.app.rehana.files;

import org.apache.logging.log4j.util.Strings;

import java.io.*;

public class FileInputoutputExample {
    public  void fileoperations() throws IOException {

        InputStream inputStream = null;
        OutputStream  outputStream = null;
        try {
            inputStream = new FileInputStream("rehana.txt");
             outputStream = new FileOutputStream("arha.txt");
           // System.out.println(inputStream.read());
            String str = "my name is rehana";
            System.out.println(str.length());
            int asci = 0;
            while (asci != -1) {
                asci = inputStream.read();
                outputStream.write(asci);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            inputStream.close();


        }


    }
}
