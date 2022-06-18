package com.codexbox.springboot.app.rehana.filehandling;

import java.io.*;

public class FileInputoutputExample {
    public  void fileoperations() throws IOException {

        InputStream inputStream = null;
        InputStream inpstream = null;
        OutputStream  outputStream = null;
       // BufferedInputStream bufferedStream = null;
        try {
            inputStream = new FileInputStream("rehana.txt");
             inpstream = new FileInputStream("arha.txt");
            // bufferedStream = new BufferedInputStream(inputStream);
             outputStream = new FileOutputStream("abcoutt.txt");
            System.out.println(inputStream.available()+"&" +inpstream.available());
            System.out.println( inputStream.getClass());


            String str ="buffer jdhgdgdhdhhdhdhhhdd idjddjjddgdfdfdfadhfhfhfutrayauusgugsa klfkljjiuuhhhhggmy name is rehana";
            System.out.println(str.length());
            // System.out.println(inputStream.read());
            int asci = 0;
            int f2 = 0;
            while (asci != -1) {
                asci =inputStream.read();
                outputStream.write(asci);
            }
                while (f2!=-1) {
                    f2 = inpstream.read();
                    outputStream.write(f2);
                }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            inputStream.close();
            inpstream.close();
           // bufferedStream.close();

            outputStream.close();


        }


    }
}
