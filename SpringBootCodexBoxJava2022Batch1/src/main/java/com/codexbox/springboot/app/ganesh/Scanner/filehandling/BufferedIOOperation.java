package com.codexbox.springboot.app.ganesh.Scanner.filehandling;

import java.io.*;

public class BufferedIOOperation {
    public void bios() throws IOException
    {
        InputStream fis = new FileInputStream("C:\\mafia.txt");
        OutputStream fos = new FileOutputStream("D:\\combination.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int i;
        while ((i = bis.read()) != -1) {
             bos.write(i);

        }
        System.out.println("File copied successfully");

        bis.close();
        bos.close();
        fis.close();
        fos.close();
    }
}