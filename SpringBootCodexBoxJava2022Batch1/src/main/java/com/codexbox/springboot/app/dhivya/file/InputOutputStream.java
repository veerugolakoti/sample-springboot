package com.codexbox.springboot.app.dhivya.file;



import java.io.*;

public class InputOutputStream {
    public void ioOperations() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("samplefile.txt");
            outputStream = new FileOutputStream("sample2.txt");

            int asci = 0;
            while (asci !=-1) {
                asci = inputStream.read();
                outputStream.write(asci);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not find");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();

            }
             catch (IOException e) {
              throw new RuntimeException(e);
            }
        }
    }}
