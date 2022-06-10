package com.codexbox.springboot.app.vidyadarna.fileInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceExample {
    public void sequenceInputStream() throws IOException {


        FileInputStream file1 = null;
        FileInputStream file2 = null;
        FileOutputStream fileOut = null;
        SequenceInputStream inputStream = null;


        try {
            file1 = new FileInputStream("vidya.txt");
            file2 = new FileInputStream("abc.txt");
            fileOut = new FileOutputStream("divya.txt");
            inputStream = new SequenceInputStream(file1, file2);
            int data = 0;
            while (data != -1) {
                data = inputStream.read();
                fileOut.write(data);
                System.out.print((char)data);

            }
        } catch (IOException e) {
            System.out.println("input output  exception");
            inputStream.close();
            file1.close();
            file2.close();
             file1.close();
        }
    }
}
