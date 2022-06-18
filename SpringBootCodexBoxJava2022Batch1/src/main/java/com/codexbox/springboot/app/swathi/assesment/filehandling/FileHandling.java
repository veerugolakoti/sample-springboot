package com.codexbox.springboot.app.swathi.assesment.filehandling;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.*;
import java.nio.Buffer;

public class FileHandling {
  public void filemethod(){

      try {
          FileReader freader = new FileReader("myfile.txt");
         InputStream Files =new FileInputStream("myfile.txt");
         BufferedReader file1=new BufferedReader(freader);
         System.out.println(file1.read());
         File file=new File("myfile.txt");
        // Buffer file2=new Buffer(file);
         BufferedInputStream inputStream=new BufferedInputStream(Files);
         System.out.println(inputStream.read());
        // FileDescriptor fileDescriptor=new FileDescriptor("myfile.txt");
         FileInputStream fileInputStream=new FileInputStream("myfile.txt");
         BufferedInputStream file3=new BufferedInputStream(fileInputStream);
         System.out.println(fileInputStream.read());
         FileReader reader=new FileReader( "myfile.txt");
         BufferedReader bufferedReader=new BufferedReader(reader);
         System.out.println(bufferedReader.readLine());
         Scanner scanner=new Scanner(file);
      /*   while(scanner.hasNextLine()) {
            String data=bufferedReader.readLine();
            System.out.println(data);
         }*/

         while (scanner.hasNextLine()){
            String data1=scanner.nextLine();
            System.out.println(data1);
         }
      } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
      } catch (IOException e) {
         throw new RuntimeException(e);
      }

   }
}

