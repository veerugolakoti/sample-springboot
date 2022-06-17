package com.codexbox.springboot.app.ganesh.Scanner.filehandling;

import java.io.*;

public class BufferedIOOperation {
    public void bios() throws IOException
    {
         FileInputStream  fis = new FileInputStream("C:\\mafia.txt");
      FileInputStream fis1 = new FileInputStream("D:\\inputfile.txt");
        FileOutputStream fos = new FileOutputStream("D:\\combination.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedInputStream bis1 = new BufferedInputStream(fis1);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int i,l;
        while ((i = bis.read()) != -1) {
            bos.write(i);
            while ((l=bis1.read())!=-1){
                bos.write(l);
            }

        }
        System.out.println("File copied successfully");

        bis.close();
        bos.close();
        fis.close();
        fos.close();
        fis1.close();
        bis1.close();
    }
}