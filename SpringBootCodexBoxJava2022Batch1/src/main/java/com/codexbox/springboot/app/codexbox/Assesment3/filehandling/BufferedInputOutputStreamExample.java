package com.codexbox.springboot.app.codexbox.Assesment3.filehandling;

import java.io.*;

public class BufferedInputOutputStreamExample {
//    public static void main(String[] args) {
//    try{
//        FileInputStream fin=new FileInputStream("ShivaNarayan.txt");
//        BufferedInputStream bin=new BufferedInputStream(fin);
//        int i;
//        while((i=bin.read())!=-1){
//            System.out.print((char)i);
//        }
//        bin.close();
//        fin.close();
//    }catch(Exception e){System.out.println(e);}


    InputStream inputFile1;
    BufferedInputStream bufferInpFile;
    OutputStream outputFile;

    public void transferBufferFile() {
        try {
            outputFile = new FileOutputStream("output.txt");
            inputFile1 = new FileInputStream("SivaNarayan.txt");
            bufferInpFile = new BufferedInputStream(inputFile1);

            int filedata1 = 0;
            while (filedata1 != -1) {
                filedata1 = inputFile1.read();
                outputFile.write(filedata1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                inputFile1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outputFile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }



