package com.codexbox.springboot.app.jhansiproject.filehandling;

import java.io.*;

public class SequenceInputStreamExample {
    InputStream input2;

    InputStream input1;
    FileOutputStream fileoutput;


    void methods(){
        try {
             input1=new FileInputStream("car.txt");
            input2=new FileInputStream("bus.txt");
            SequenceInputStream inst=new SequenceInputStream(input1, input2);
            fileoutput=new FileOutputStream("output.txt");
            int abc=0;
            while ((abc = inst.read()) !=-1) {
                fileoutput.write((char)abc);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
