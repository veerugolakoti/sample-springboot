package com.codexbox.springboot.app.codexbox.BhargavTej.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceStreams {
    FileInputStream inpdata1 ;
    FileInputStream inpdata2;
    FileInputStream inpdata3;

   public char sequenceMethod(){
       try {
           inpdata1 = new FileInputStream("bhargav.txt");
           inpdata2 = new FileInputStream("SivaNarayan.txt");
           inpdata3 = new FileInputStream("teja.txt");

           Vector vr = new Vector();
           vr.add(inpdata1);
           vr.add(inpdata2);
           vr.add(inpdata3);

           Enumeration enumeration = vr.elements();
           SequenceInputStream sqinpstream = new SequenceInputStream(enumeration);
           System.out.print(sqinpstream.available());
           System.out.print(sqinpstream.available());
           int i =0;
           while ((i= sqinpstream.read())!= -1){
               System.out.print((char)i);
           }
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       finally {
           try {
               inpdata1.close();
               inpdata2.close();
               inpdata3.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
       return 0;
   }

   }

