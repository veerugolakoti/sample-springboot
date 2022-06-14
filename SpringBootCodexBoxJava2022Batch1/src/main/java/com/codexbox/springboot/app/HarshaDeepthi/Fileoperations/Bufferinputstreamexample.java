package com.codexbox.springboot.app.HarshaDeepthi.Fileoperations;

import java.io.*;

public class Bufferinputstreamexample {
    FileInputStream fileinput;
    BufferedInputStream bufferinput;
    FileOutputStream fileoutput;
      public void  buffermethod(){
          try{
              fileinput=new FileInputStream("Harsha.txt");
              bufferinput=new BufferedInputStream(fileinput);
              fileoutput=new FileOutputStream("Renuka.txt");
              System.out.println(bufferinput.available());
              int ascii=0;
              while(ascii != -1) {
                  ascii = bufferinput.read();
                  fileoutput.write(ascii);
              }
          } catch (FileNotFoundException e) {
              throw new RuntimeException(e);
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
      }
}
