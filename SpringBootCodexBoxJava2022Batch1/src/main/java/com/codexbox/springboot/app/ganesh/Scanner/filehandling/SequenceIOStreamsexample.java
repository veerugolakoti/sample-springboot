package com.codexbox.springboot.app.ganesh.Scanner.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceIOStreamsexample {


    public void sios() throws IOException {


        FileInputStream fis1 = new FileInputStream("C:\\mafia.txt");
        FileInputStream fis2 = new FileInputStream("D:\\inputfile.txt");
        FileInputStream fis3 = new FileInputStream("gun.txt");
        FileInputStream fis4 = new FileInputStream("D:\\sangam.txt");
        FileOutputStream fos = new FileOutputStream("D:\\aaa.txt");
        Vector v = new Vector();
        v.add(fis1);
        v.add(fis2);
        v.add(fis3);
        v.add(fis4);
        Enumeration e =  v.elements();

        SequenceInputStream sis = new SequenceInputStream(e);

        int j;
        while ((j=sis.read())!=-1)
    {
            fos.write(j);
        }
        fis1.close();
        fis2.close();
        fis3.close();
        fis4.close();
        sis.close();
        fos.close();
        System.out.println("Successfully Copied");
    }
}










