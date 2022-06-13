package ioStreams;

import java.io.*;

public class BufferedStream {
     public void myBuffered() throws IOException {
//         try {
            /* FileInputStream fi=new FileInputStream("abc.txt");
             BufferedInputStream bi=new BufferedInputStream(fi);*/
             FileOutputStream fi=new FileOutputStream("abc.txt");
             BufferedOutputStream bi=new BufferedOutputStream(fi);

             String str="Iam going to my home";
             byte b[]=str.getBytes();
             bi.close();
             fi.close();
//             System.out.println("vamshi going to chennai");


         /*    int i;
             while ((bi.read())!=-1){
                 System.out.print((char)i);
             }
             bi.close();
             fi.close();*/
//         } catch (FileNotFoundException e) {
//             throw new RuntimeException(e);
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }
     }
}
