package com.codexbox.springboot.app.vasu.sample.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedInputOutputStream {
    // Buffered InputStream
   /* FileInputStream fileInputStream=null;
    FileOutputStream fileOutputStream=null;
    BufferedInputStream bufferedInputStream=null;
   public void bufferInput(){
       try {
           fileInputStream=new FileInputStream("Abc.txt");
           fileOutputStream=new FileOutputStream("Vaasu1.txt");
           bufferedInputStream=new BufferedInputStream(fileInputStream);
           int number=0;
           while(number!=-1){
               number=fileInputStream.read();
               fileOutputStream.write(number);
           }
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       finally {
           try {
               fileInputStream.close();
               fileOutputStream.close();
               bufferedInputStream.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }

   }*/
    // Buffered Output Stream
    FileOutputStream fileOutputStream;
    BufferedOutputStream bufferedOutputStream;
    public void bufferOutput() {


        try {
            fileOutputStream = new FileOutputStream("Output.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "welcome to cdex box oraganisation";
            byte[] b = str.getBytes(StandardCharsets.UTF_8);

            int output = 0;
            bufferedOutputStream.write(b);
            bufferedOutputStream.flush();
//            while (output != -1) {
//
//
//            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileOutputStream.close();
                bufferedOutputStream.close();
                System.out.println("Success");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}


























