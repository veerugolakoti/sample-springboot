package com.codexbox.springboot.app.jhansiproject.filehandling;

import java.io.*;

public class InputOutputStreams {
    InputStream inputStream;
    OutputStream outstream;
  public void method (){

    {
      try {
            inputStream = new FileInputStream("jhansi.txt");
            outstream=new FileOutputStream("output.txt");
           int data=0;
            while (data!=-1){
                data= inputStream.read();
                outstream.write(data);
            }
            System.out.println("done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outstream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}}
