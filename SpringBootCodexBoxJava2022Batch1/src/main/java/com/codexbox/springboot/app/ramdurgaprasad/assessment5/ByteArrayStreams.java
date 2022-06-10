package com.codexbox.springboot.app.ramdurgaprasad.assessment5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayStreams {
   public void bytearray() {
       byte[] array = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
       ByteArrayInputStream byteArrayStreams = new ByteArrayInputStream(array);
       System.out.println(byteArrayStreams.available());
       for (int i = 0; i < 3; i++) {
           byteArrayStreams.read();
       }
       System.out.println(byteArrayStreams.available());
       System.out.println("uyrsuydf"+byteArrayStreams.markSupported());
       try {
           byteArrayStreams.close();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }}
public void method(){
     ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
       String str = "the code is complicate if you dont know the basics";
       try {
           byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
           byte[] array1 = byteArrayOutputStream.toByteArray();
           for (int i = 0; i < array1.length; i++) {
               System.out.print((char)array1[i]);

           }


       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }
}
