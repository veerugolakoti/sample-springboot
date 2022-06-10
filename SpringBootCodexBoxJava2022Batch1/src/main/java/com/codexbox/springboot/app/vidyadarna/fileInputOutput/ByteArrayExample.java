package com.codexbox.springboot.app.vidyadarna.fileInputOutput;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class ByteArrayExample {
    public void byteArray() throws IOException {


        FileOutputStream    file1 = new FileOutputStream("vidya.txt");
        FileOutputStream     file2 = new FileOutputStream("abc.txt");
        ByteArrayOutputStream   byt2 = new ByteArrayOutputStream();

        byt2.write(65);
        byt2.write(55);
      //  byt2.size();
        byt2.writeTo(file1);
        byt2.writeTo(file2);
        byt2.close();
        //  bytA = new ByteArrayInputStream();


    }
}
