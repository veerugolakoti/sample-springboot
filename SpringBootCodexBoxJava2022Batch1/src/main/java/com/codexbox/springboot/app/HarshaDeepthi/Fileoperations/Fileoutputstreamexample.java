package com.codexbox.springboot.app.HarshaDeepthi.Fileoperations;

import java.io.FileOutputStream;

public class Fileoutputstreamexample {
   public static void  fileoutputex(){
       try{
           FileOutputStream fout=new FileOutputStream("E:\\testout.txt");
           String s="Welcome to codexbox";
           byte b[]=s.getBytes();
           fout.write(b);
           fout.close();
           System.out.println("success...");
       }catch(Exception e) {
           System.out.println(e);
       }
   }



}

