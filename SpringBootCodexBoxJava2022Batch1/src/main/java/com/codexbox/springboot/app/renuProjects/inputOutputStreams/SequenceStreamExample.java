package com.codexbox.springboot.app.renuProjects.inputOutputStreams;

import java.io.*;

public class SequenceStreamExample {
    FileInputStream finput;
    FileInputStream finput2;
    SequenceInputStream seqinput;
    //FileOutputStream fileout;

    public void sequMethod(){
        try {
            finput=new FileInputStream("vrr.txt");
            finput2=new FileInputStream("ppp.txt");
            seqinput=new SequenceInputStream(finput,finput2);
            //fileout=new FileOutputStream("app.txt");

            int i = 0;
            while ((i=seqinput.read()) != -1){
                System.out.print((char)i);

               // fileout.write((i));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
          /*  try {
                fileout.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/
            try {
                finput2.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
           /* try {
                fileout.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/
            try {
                seqinput.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
