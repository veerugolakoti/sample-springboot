package com.codexbox.springboot.app.ramdurgaprasad;

import java.io.*;

public class FileHandling {
    public void InputOutputHandling() throws IOException {
        InputStream inputStream =null;
        InputStream inputStream1 = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("ram.txt");
            inputStream1 = new FileInputStream("rams.txt");
            outputStream = new FileOutputStream("prdp.txt");



           int ascii = 0,ascii2=0;
            while(ascii !=-1||ascii2!=-1){
                ascii = inputStream.read();
                ascii2=inputStream1.read();
                outputStream.write(ascii);
                outputStream.write(ascii2);
            }

        } catch (FileNotFoundException e) {
            System.out.println("runtime exception is occured");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
          outputStream.close();
          inputStream.close();
        }
          /*  try {

                FileReader fileReader = new FileReader("ram.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while(true){
                    String lines = bufferedReader.readLine();
                   if(lines == null){
                       break;
                   }
                    System.out.println(lines);
                }
                 } catch (FileNotFoundException e) {
                System.out.println(" file is not found ,please check the file and try again");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/

    }
}