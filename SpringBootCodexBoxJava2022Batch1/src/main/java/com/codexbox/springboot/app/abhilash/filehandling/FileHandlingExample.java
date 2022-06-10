package com.codexbox.springboot.app.abhilash.filehandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingExample {
    public void example() throws IOException {
        InputStream inputStream = null;
        InputStream inputStream1 = null;
        OutputStream outputStream = null;
        File file = new File("second.txt");
       // System.out.println(file);
        //OutputStream outputStream1 = new FileOutputStream(file);
        Scanner sc = new Scanner(System.in);


        try {
            inputStream = new FileInputStream("abc.txt");
            outputStream = new FileOutputStream("dcb.txt");

            FileWriter new_fw = new FileWriter("second.txt");
           //new_fw.write("hi welcome to file handling utilities ");
            new_fw.write("name: Abhilash");
            new_fw.write("id: 22082");
            new_fw.write("hyd");

            int number = 0;
            while(number != -1) {
                 number = sc.nextInt();
                new_fw.write(number);
            }
            new_fw.close();
            inputStream1 = new FileInputStream("second.txt");
            outputStream = new FileOutputStream("dcb.txt");
           // BufferedInputStream buffer = new BufferedInputStream(inputStream);
//            FileReader file = new FileReader("abc.txt");
//            BufferedReader bufferedReader = new BufferedReader(file);
//            System.out.println(bufferedReader.readLine());
            //System.out.println(buffer.read());
            int asci =0;
           while(asci!= -1) {
               asci = inputStream.read();
              //System.out.print(asci);
               outputStream.write(asci);
           }
           int asci1 = 0;
           while (asci1 != -1) {
               asci1 = inputStream1.read();
              // System.out.println(asci1);
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
            inputStream1.close();

        }
    }
}
