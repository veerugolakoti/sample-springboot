package com.codexbox.springboot.app.renuProjects.inputOutputStreams;

import java.io.*;

public class BufferedInputStreamExample {
    FileInputStream fileinput;
    BufferedInputStream bufferinput;
    FileOutputStream fileoutput;

    public void buffermethod(){
        try {
            fileinput=new FileInputStream("vsr.txt");
            bufferinput=new BufferedInputStream(fileinput);
            fileoutput=new FileOutputStream("ccc.txt");

            //System.out.println(bufferinput.read());
            System.out.println(bufferinput.available());


            int ascii=0;
            while (ascii !=-1){
               ascii= bufferinput.read();
               fileoutput.write(ascii);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileinput.close();
                fileoutput.close();
                bufferinput.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
