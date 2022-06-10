package com.codexbox.springboot.app.codexbox.Assesment3.filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedInputOutputStreamExample {

    //BufferedOutputStream example
    public static void main(String[] args) {
        OutputStream outputFile = null;
        BufferedOutputStream bufferoutfile = null;
        try {
            outputFile = new FileOutputStream("output.txt");
            bufferoutfile = new BufferedOutputStream(outputFile);
            String str = "Hello World I am Chitti.The Robot, Speed 1 terahertz, memory 1 zeta byte.";
            byte byt[] = str.getBytes(StandardCharsets.UTF_8);
            bufferoutfile.write(byt);
            bufferoutfile.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            try {
                outputFile.close();
                bufferoutfile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Success");


    }


    //BufferedInputStream of each input and output
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



    //BufferedInputStream example of each input and output
    InputStream inputFile1;
    BufferedInputStream bufferInpFile;
    OutputStream outputFile;

    public void transferBufferFile() {
        try {
            inputFile1 = new FileInputStream("SivaNarayan.txt");
            outputFile = new FileOutputStream("output.txt");
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



