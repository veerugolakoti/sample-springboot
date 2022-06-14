package com.codexbox.springboot.app.HarshaDeepthi.Fileoperations;

import java.io.*;

public class Sequencestreamexample {
    FileInputStream finput;
    FileInputStream finput2;
    SequenceInputStream seqinput;
    public void seqMethod(){
        try{
            finput=new FileInputStream("prabhas.txt");
            finput2=new FileInputStream("keerthi.txt");
            seqinput=new SequenceInputStream(finput,finput2);
            int i=0;
            while((i=seqinput.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(null != finput) {
                    finput.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(null != finput2) {
                    finput2.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(null != seqinput) {
                    seqinput.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }



