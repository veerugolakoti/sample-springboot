package com.codexbox.springboot.app.abhilash.filehandling;


import java.io.*;

public class Sample {

    public void baos()  {
        FileOutputStream file1 = null;
        FileOutputStream file2 = null;
        ByteArrayOutputStream byt = null;
        try {
            file1 = new FileOutputStream("abc.txt");
            file2 = new FileOutputStream("dcb.txt");
            byt = new ByteArrayOutputStream(2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            int b = 65;
            byt.write(b);
            byt.writeTo(file1);
            byt.writeTo(file2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
