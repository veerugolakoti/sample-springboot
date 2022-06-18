package com.codexbox.springboot.app.TejaAravind.Streams;

import java.io.*;

public class FileReadingExample {
    public void inputReading(){
        try {
            InputStream inputStream = new FileInputStream("xyz.txt");
//            System.out.println(inputStream.read());
            while (true){
                int i = inputStream.read();
                if (i == -1){
                    break;
                }
                System.out.print((char) i);
            }


//            Reader reader = new BufferedInputStream(inputStream.);

           /* Reader reader = new FileReader("xyz.txt");
            BufferedReader br = new BufferedReader(reader);
            while (true){
                String line = br.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);

            }*/




        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
