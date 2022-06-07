package com.codexbox.springboot.app.renuProjects.inputOutputStreams;

import java.io.*;

public class InputStreamExample {
    public void fileInputStreamMethod()  {
        // int ascii[] = new int[30];
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("abc.txt");
            inputStream=new FileInputStream("xyz.txt");
            outputStream = new FileOutputStream("abc.tx");

           //System.out.println(inputStream.read());

            int ascii = 0;
            while (ascii != -1) {
                ascii = inputStream.read();
                outputStream.write(ascii);
            }

       /*     System.out.println();
            FileReader fileReader=new FileReader("abc.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);*/


           /* for (int i=0;i<4; i++)
                System.out.println(bufferedReader.readLine());*/
        } catch (FileNotFoundException e) {
            System.out.println("file is not there please check");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        }

    }

