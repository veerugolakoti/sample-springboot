package com.codexbox.springboot.app.vamshi.files;

import com.sun.xml.internal.ws.api.message.stream.InputStreamMessage;

import java.io.*;

public class InputOutputStreamSample {
    InputStream inputStream = null;
    OutputStream outputStream = null;
    public void fileInputOutputOperations() throws IOException {

        try {
            inputStream = new FileInputStream("vam.txt");
            outputStream = new FileOutputStream("kris.txt");
            int bike = 0;
            while (bike != -1){
                bike = inputStream.read();
                outputStream.write(bike);
            }
            System.out.println("done");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception occur please create a file ");
        } catch (IOException e) {
            System.out.println("Io stream exception will occur");
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
// FileReader readfile = new FileReader("vam.txt");
// BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
// DataInputStream dataInputStream = new DataInputStream(fileInputStream);
//System.out.println(dataInputStream.readUTF());
// bufferedInputStream.read();
// FilterInputStream filterInputStream = new FilterInputStream();
// BufferedReader bufferedReader = new BufferedReader(readfile);
// System.out.println(bufferedReader.readLine());
// System.out.println(bufferedReader);
// InputStreamMessage inputStreamMessage = new InputStreamMessage();