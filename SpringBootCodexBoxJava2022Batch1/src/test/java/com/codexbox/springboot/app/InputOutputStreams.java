package com.codexbox.springboot.app;

import java.io.*;

public class InputOutputStreams {
    public void fileInputOutputoperations() throws IOException {
        InputStream inputStream=null;
        InputStream inputStream1=null;
        OutputStream outputStream=null;
        try{
            inputStream=new FileInputStream("pqr.txt");
            inputStream1=new FileInputStream("mno.txt");
            outputStream=new FileOutputStream("vaasu.txt");

            int asci=0;
            while (asci!=-1){
                asci=inputStream.read();
                outputStream.write(asci);
            }
           // System.out.println(inputStream.read());
            int asci1=0;
            while (asci1!=-1){
                asci1=inputStream1.read();
                outputStream.write(asci1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            inputStream.close();
            inputStream1.close();
            outputStream.close();
        }

    }

}
