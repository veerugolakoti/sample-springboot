package com.codexbox.springboot.app.swathi.assesment.filehandling;

import java.io.*;

public class Inputoutputstream {
   InputStream inputStream=null;

   OutputStream outputStream=null;
   public void fileinputoutputoperations() throws IOException {
      try {
         inputStream=new FileInputStream("swathi.txt");
         outputStream=new FileOutputStream("output.txt");
         int asci = 0;
         while(asci!=-1){
            asci=inputStream.read();
            outputStream.write(asci);
         }
         System.out.println("done");
      } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
      } catch (IOException e) {
         throw new RuntimeException(e);
      } finally {
         inputStream.close();
         outputStream.close();
      }

   }

   }

