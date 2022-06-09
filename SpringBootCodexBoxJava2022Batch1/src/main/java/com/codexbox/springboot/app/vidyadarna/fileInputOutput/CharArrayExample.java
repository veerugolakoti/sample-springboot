package com.codexbox.springboot.app.vidyadarna.fileInputOutput;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayExample {
    public void charArrayExample() throws IOException {
        char[] Array = {'h','a','i','e','v','r','y','o','n','e'};
        CharArrayReader reader = new CharArrayReader(Array);
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("welcome to codexbox");
        FileWriter f1 = new FileWriter("a.txt");
        FileWriter f2 = new FileWriter("b.txt");
        FileWriter f3 = new FileWriter("c.txt");

        int data = 0;
        while (data != -1){
            data = reader.read();
            char ch = (char) data;
            System.out.print(ch+ " : ");
            System.out.println(data);

        }
        writer.writeTo(f1);
        writer.writeTo(f2);
        writer.writeTo(f3);

        f1.close();
        f2.close();
        f3.close();
        System.out.println("completed..");
    }
}
