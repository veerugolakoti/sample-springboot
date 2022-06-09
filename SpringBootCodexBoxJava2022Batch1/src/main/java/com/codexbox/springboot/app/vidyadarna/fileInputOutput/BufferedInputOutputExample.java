package com.codexbox.springboot.app.vidyadarna.fileInputOutput;

import java.io.*;

public class BufferedInputOutputExample{
    public void bufferedInputStream () {
    }

    BufferedInputStream bufferedInputStream = null;
    BufferedOutputStream bufferedOutputStream = null;

    BufferedReader br = null;
    BufferedWriter br2 = null;
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;

    {
        try {
            fileInputStream = new FileInputStream("vidya.txt");
            fileOutputStream = new FileOutputStream("cc.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
//            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//            br = new BufferedReader(fileInputStream);
            int data = 0;
            while (data != -1){
            data = bufferedInputStream.read();
            bufferedOutputStream.write(data);

            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            assert bufferedInputStream != null;
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);

            }
        }
    }

}





