package com.codexbox.springboot.app.swathi.assesment.filehandling;

import java.io.*;

public class BufferExample {
    FileInputStream fileinput;
    BufferedInputStream bufferinput;
    FileOutputStream fileoutput;
  public   void buffer() throws FileNotFoundException {
        try {
            fileinput=new FileInputStream("hyderabad.txt");
            bufferinput=new BufferedInputStream(fileinput);
            fileoutput=new FileOutputStream("mulugu.txt");
            int ascii=0;
            while (ascii !=-1) {
                ascii = fileinput.read();
                fileoutput.write(ascii);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileinput.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferinput.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileoutput.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
