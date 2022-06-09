package com.codexbox.springboot.app.rehana.files;

import java.io.*;

public class BufferedoutputStreamExample {
    public void operations() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
             inputStream = new FileInputStream("rehana.txt");
             inputStream = new FileInputStream("arha.txt");
             outputStream = new FileOutputStream("abcoutt.txt");

           // OutputStream outputStream = new FilterOutputStream("arha.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);

            System.out.println(bufferedInputStream.read());
            int asci = 0;
            int f2 = 0;
            while (asci!=-1){
                asci = bufferedInputStream.read();
                outputStream.write(asci);
            }
            while (f2 !=-1){
                f2 =bufferedInputStream.read();
                outputStream.write(f2);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            inputStream.close();
            outputStream.close();
            bufferedInputStream.close();
        }
    }


    }


