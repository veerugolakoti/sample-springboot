package com.codexbox.springboot.app;

import java.io.*;

public class InputOutputStreams {
    public void fileInputOutputoperations() throws IOException {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try{
            inputStream=new FileInputStream("pqr.txt");
            outputStream=new FileOutputStream("vaasu.txt");
            System.out.println(inputStream.read());
            int asci=0;
            while (asci!=-1){
                asci=inputStream.read();
                outputStream.write(asci);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            inputStream.close();
        }

    }

}
