package com.codexbox.springboot.app.abhilash.filehandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingExample {
    Scanner sc = new Scanner(System.in);
    public void example() throws IOException {


        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("abc.txt");
            outputStream = new FileOutputStream("dcb.txt");
            BufferedInputStream buffer = new BufferedInputStream(inputStream);
            FileReader file1 = new FileReader("abc.txt");
//            BufferedReader bufferedReader = new BufferedReader(file1);
//            System.out.println(bufferedReader.readLine());
//            int asci =0;
//           while(asci!= -1) {
//               asci = inputStream.read();
//              //System.out.print(asci);
//               outputStream.write(asci);
//           }
           int asci1 = 0;
           while (asci1 != -1) {
               asci1 = buffer.read();
               outputStream.write(asci1);
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
    public void second() {
        File file = new File("third.txt");
        //System.out.println(file);
        FileWriter new_fw ;
        try {
            new_fw = new FileWriter("third.txt");
            new_fw.write("hi welcome to file handling utilities ");
            new_fw.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
