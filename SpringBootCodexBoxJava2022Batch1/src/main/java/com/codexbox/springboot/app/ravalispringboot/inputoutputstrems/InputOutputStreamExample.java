package com.codexbox.springboot.app.ravalispringboot.inputoutputstrems;

import javax.print.DocFlavor;
import java.io.*;
import java.util.Scanner;

public class InputOutputStreamExample {


    public void Inputoutputmethod() {
        InputStream inputStream = null;
        InputStream inputStream1= null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("Abc.txt");
            inputStream1= new FileInputStream("Rst.txt");
            outputStream = new FileOutputStream("Xyz.txt");
            int asci = 0;

            while (asci != -1) {
                asci = inputStream.read();
                outputStream.write(asci);
            }
            int asci1=0;
            while(asci1 != -1){
                asci1 = inputStream1.read();
               outputStream.write(asci1);
            }

        } catch (FileNotFoundException e) {
            System.out.println(" file is not there ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                inputStream1.close();
                outputStream.close();
                //inputStream1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

}