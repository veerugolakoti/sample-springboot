package com.codexbox.springboot.app.ramdurgaprasad.assessment5;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileStream {
    public void Fileinput()  {
        try {
            InputStream fileinputstream = new FileInputStream("rams.txt");


     fileinputstream.mark(10);
//            System.out.println(fileinputstream.read());
//            System.out.println(fileinputstream.markSupported());
//     fileinputstream.reset();
           int  a=fileinputstream.available();
            System.out.println(a);
            byte[] array = new byte[a];
            fileinputstream.read(array);
            System.out.println("the data read from the file is :");
            String file = new String(array);
            System.out.println(file);

             fileinputstream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }}


