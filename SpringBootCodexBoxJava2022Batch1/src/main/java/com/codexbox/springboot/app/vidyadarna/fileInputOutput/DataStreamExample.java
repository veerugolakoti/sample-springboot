package com.codexbox.springboot.app.vidyadarna.fileInputOutput;

import java.io.*;

public class DataStreamExample {
    public  void  dataStream() throws IOException {
        InputStream inputStream = new FileInputStream("123.txt");
        FileOutputStream outputStream = new FileOutputStream("232.txt");

        DataInputStream data = new DataInputStream(inputStream);
        DataOutputStream data2 = new DataOutputStream(outputStream);
        data2.writeInt(45);
        data2.flush();

        int count = inputStream.available();
        byte[] byt = new byte[count];
        data.read(byt);
        for (byte b:byt) {
            char c = (char)b;
            System.out.print(c+ " : ");
            data.close();
            data2.close();
            
        }


    }
}
