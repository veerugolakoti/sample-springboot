package com.codexbox.springboot.app.renuProjects.inputOutputStreams;

import java.io.*;

public class InputStreamExample {
    public void fileInputStreamMethod() throws IOException {
        // int ascii[] = new int[30];
        InputStream inputStream = null;
        InputStream inputStream1 = null;
        OutputStream outputStream = null;


        inputStream = new FileInputStream("abc.txt");
        inputStream1 = new FileInputStream("xyz.txt");
        outputStream = new FileOutputStream("abc.tx");

        int ascii = 0;
        while (ascii != -1)
        {
            ascii = inputStream.read();
        outputStream.write(ascii);
    }
                int ascii2 = 0;
                while (ascii2 != -1) {
                    ascii2 = inputStream1.read();
                    outputStream.write(ascii2);
                }
            }


    }

