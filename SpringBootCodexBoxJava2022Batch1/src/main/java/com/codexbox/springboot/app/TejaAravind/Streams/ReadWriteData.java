package com.codexbox.springboot.app.TejaAravind.Streams;

import java.io.*;
import java.util.Arrays;


public class ReadWriteData {
    InputStream inputStream = null;
    InputStream inpStream = null;
    OutputStream outputStream = null;
    public void readWriteData(){

        try{
            inputStream = new FileInputStream("xyz.txt");
            inpStream =new FileInputStream("qwe.txt");
            outputStream = new FileOutputStream("abc.txt");
            int[] arr = new int[inpStream.available()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = inpStream.read();
            }
            System.out.println(Arrays.toString(arr));




            while (true){
                int data = inputStream.read();
                if (data == -1){
                    break;
                }
                outputStream.write(data);
            }

            // for new line ascii value is 13.
            outputStream.write(13);

            for (int i : arr) {
                outputStream.write((char)i);
            }


           /* int ascii = 1, bascii = 1;
            while (bascii != -1 ){
                ascii = inputStream.read();
                outputStream.write(ascii);
                if (ascii == -1) {
                    bascii = inpStream.read();
                    outputStream.write(bascii);
                }

            }*/
        } catch (FileNotFoundException e){
            System.out.println("File not found exception " + e.getMessage());

        } catch (IOException e) {
            System.out.println("IO exception found " + e.getMessage());
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                System.out.println("IO exception is found "+e.getMessage());
            }

        }
    }
}
