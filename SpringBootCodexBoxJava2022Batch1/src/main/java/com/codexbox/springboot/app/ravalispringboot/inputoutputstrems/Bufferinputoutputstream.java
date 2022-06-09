package com.codexbox.springboot.app.ravalispringboot.inputoutputstrems;

import org.omg.CORBA_2_3.portable.OutputStream;

import java.io.*;

public class Bufferinputoutputstream {


  public    void bufferMethod() {
      FileInputStream fileinput = null;
      FileOutputStream fileOutput = null;
      BufferedInputStream bis = null;

        try {
            fileinput= new FileInputStream("RAVALI.txt");
            fileOutput= new FileOutputStream("ABC.txt");
            bis= new BufferedInputStream(fileinput);

            int asci=0;
            while (asci != -1) {
                asci=fileinput.read();
                fileOutput.write(asci);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" file is not there ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileinput.close();
                fileOutput.close();
                bis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            }
        }


        }





