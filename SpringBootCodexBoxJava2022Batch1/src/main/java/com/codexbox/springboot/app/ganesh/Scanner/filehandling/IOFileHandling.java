package com.codexbox.springboot.app.ganesh.Scanner.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFileHandling {

     public void fileoperation() throws IOException {
//         try {
//             FileReader fileReader =new FileReader("D:\\inputfile.txt");
//             BufferedReader bufferedReader = new BufferedReader(fileReader);
//             System.out.println(bufferedReader.readLine());
//         } catch (FileNotFoundException e) {
//             throw new RuntimeException(e);
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }


          FileInputStream fis;
          try {
               fis = new FileInputStream("D:\\inputfile.txt");
          } catch (FileNotFoundException e) {
               throw new RuntimeException(e);
          }


          FileOutputStream fos = null;

          try {
               fos = new FileOutputStream("C:\\Users");

               int l;
               while ((l = fis.read()) != -1) {
                    fos.write(l);
               }

          } catch (IOException e) {
               throw new RuntimeException(e);
          } finally {
               System.out.println("copied successfully");
               fis.close();
               fos.close();
          }
     }
}