package com.codexbox.springboot.app.ravalispringboot.inputoutputstrems;

import java.io.*;

public class SequnceinputoutputstreamExample {

    FileInputStream fileInput= null;
    FileInputStream fileinput1 = null;

    FileOutputStream fileOutput = null;
    SequenceInputStream sis = null;

    public  void sequncemethod(){
        try {
            fileInput= new FileInputStream("Rst.txt");
            fileinput1=new FileInputStream("RAVALI.txt");
            fileOutput= new FileOutputStream("aa.txt");
            sis= new SequenceInputStream(fileInput,fileinput1);
            int a ;
            while((a=sis.read())!= -1){
                fileOutput.write(a);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {

                fileInput.close();
                fileinput1.close();
                fileOutput.close();
                sis.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
