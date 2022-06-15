package com.codexbox.springboot.app.fileinputstream;

import java.io.*;
public class FileInputStreamExample {
    public void filecounting() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            InputStream inputStream1 = new FileInputStream("sasi1.txt");
            OutputStream outputStream1 = new FileOutputStream("sasi.txt");
            System.out.println("the file value is : " + inputStream1.read());
            int asci = 0;
            while (asci != -1) {
                asci = inputStream1.read();
                outputStream1.write(asci);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not exception :");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
//        try {
//            String str = "you are in the office";
//            FileReader fileReader = new FileReader(str);
//            BufferedReader br = new BufferedReader(fileReader);
//            System.out.println("these files are read : " + br.readLine());
//            InputStream inputStream = new FileInputStream(str);
//            System.out.println( "these files are readen by the count :" + inputStream.read());
//        } catch (Exception e) {
//            System.out.println("the file values are :" );
//        }

