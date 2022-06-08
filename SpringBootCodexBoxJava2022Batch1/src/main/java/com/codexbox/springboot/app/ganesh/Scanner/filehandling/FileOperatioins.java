package com.codexbox.springboot.app.ganesh.Scanner.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOperatioins {

    public void iooperations() throws IOException {
        FileInputStream fileinputstream1 = null;
        FileInputStream fileinputStream2 = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileinputstream1 = new FileInputStream("gun.txt");
            fileinputStream2 = new FileInputStream("D:\\inputfile (1).txt ");
            fileOutputStream = new FileOutputStream("D:\\combination.txt");
            int l, j;
            while ((l = fileinputstream1.read()) != -1) {
                fileOutputStream.write(l);
            }
            while ((j = fileinputStream2.read()) != -1) {
                fileOutputStream.write(j);
            }
            System.out.println("File copied sucessfully copied.");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

            fileinputstream1.close();
            fileinputStream2.close();
            if (null != fileOutputStream)
            {
                fileOutputStream.close();
            }
        }


    }
}






