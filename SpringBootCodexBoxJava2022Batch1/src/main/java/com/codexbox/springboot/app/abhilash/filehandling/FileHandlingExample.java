package com.codexbox.springboot.app.abhilash.filehandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingExample {
    public void example() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        File file = new File("second.txt");
       // System.out.println(file);
        OutputStream outputStream1 = new FileOutputStream(file);

        try {
            inputStream = new FileInputStream("abc.txt");
            outputStream = new FileOutputStream("dcb.txt");
            BufferedInputStream buffer = new BufferedInputStream(inputStream);
//            FileReader file = new FileReader("abc.txt");
//            BufferedReader bufferedReader = new BufferedReader(file);
//            System.out.println(bufferedReader.readLine());
            //System.out.println(buffer.read());
            int asci =0;
           while(asci!= -1) {
               asci =  inputStream.read();
               System.out.print(asci);
               outputStream.write(asci);
           }

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception occurred.");
        } catch (Exception e) {
            System.out.println("Input exception");
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
