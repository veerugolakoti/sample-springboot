package com.codexbox.springboot.app.codexbox.Assesment3.filehandling;

import java.io.*;

public class InputOutputStreamExample2 {
    InputStream inpFile1 = null;
    InputStream inpFile2 = null;
    OutputStream destinationFile= null;
   public  void transferFile() throws IOException {
       try {
           inpFile1 = new FileInputStream("SivaNarayan.txt");
           inpFile2 = new FileInputStream("teja.txt");
           destinationFile = new FileOutputStream("output.txt");
           int fileData1 =0;
           int fileData2 = 0;
           do {
               fileData1 = inpFile1.read();
               destinationFile.write(fileData1);
           }while (fileData1 != -1);

           while(fileData2 != -1);{
               fileData2 = inpFile2.read();
               destinationFile.write(fileData2);
           }


       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       finally {
           inpFile1.close();
           inpFile2.close();
           destinationFile.close();
       }

   }
   }
