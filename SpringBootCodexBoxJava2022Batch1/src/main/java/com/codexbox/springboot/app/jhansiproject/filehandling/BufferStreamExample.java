package com.codexbox.springboot.app.jhansiproject.filehandling;

import java.io.*;

public class BufferStreamExample {
    FileInputStream fileinput;
    BufferedInputStream bufferinput;
    FileOutputStream fileoutput;
     void method(){
         try {
             fileinput=new FileInputStream("book.txt");
             bufferinput=new BufferedInputStream(fileinput);
             fileoutput=new FileOutputStream("pen.txt");

             int ascii=0;
             while (ascii !=-1){
                 ascii=fileinput.read();
                 fileoutput.write(ascii);
             }

         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
}
