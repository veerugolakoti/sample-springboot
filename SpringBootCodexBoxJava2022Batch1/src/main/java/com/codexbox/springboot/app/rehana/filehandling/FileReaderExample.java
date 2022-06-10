package com.codexbox.springboot.app.rehana.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public void reader() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("fileout.txt");
            int i ;
            while((i=fileReader.read())!=-1){
              // i=fileReader.read();
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileReader.close();

        }
    }
}
