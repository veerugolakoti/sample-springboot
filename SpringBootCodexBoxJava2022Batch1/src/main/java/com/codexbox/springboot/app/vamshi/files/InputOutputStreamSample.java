package com.codexbox.springboot.app.vamshi.files;

import com.sun.xml.internal.ws.api.message.stream.InputStreamMessage;

import java.io.*;

public class InputOutputStreamSample {
  /*  InputStream inputStream = null;
    InputStream inputStream1 = null;
    OutputStream outputStream = null;*/
    public void fileInputOutputOperations() throws IOException {

        try {
            /*inputStream = new FileInputStream("vam.txt");
            inputStream1 = new FileInputStream("vam1.txt");
            outputStream = new FileOutputStream("kris.txt");
            int bike = 0;
            while (bike != -1){
                bike = inputStream.read();
                outputStream.write(bike);
            }
            System.out.println("done");
            outputStream.write(13);
            int bike1 = 0;
            while(bike1 != -1){
                bike1 = inputStream1.read();
                outputStream.write(bike1);
            }
            System.out.println("attached new line");
            System.out.println(inputStream1.markSupported());
            System.out.println(inputStream.available());*/
            FileReader readfile = new FileReader("vam.txt");
            BufferedReader buffer = new BufferedReader(readfile);
            String krisv = buffer.readLine();
            String[] words = krisv.split(" ");
            System.out.println(krisv);
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception occur please create a file ");
     /*   } catch (IOException e) {
            System.out.println("Io stream exception will occur");
        }finally {
            inputStream.close();
            outputStream.close();*/
        }
    }
}

// DataInputStream dataInputStream = new DataInputStream(fileInputStream);
//System.out.println(dataInputStream.readUTF());
// bufferedInputStream.read();
// FilterInputStream filterInputStream = new FilterInputStream();
// BufferedReader bufferedReader = new BufferedReader(readfile);
// System.out.println(bufferedReader.readLine());
// System.out.println(bufferedReader);
// InputStreamMessage inputStreamMessage = new InputStreamMessage();