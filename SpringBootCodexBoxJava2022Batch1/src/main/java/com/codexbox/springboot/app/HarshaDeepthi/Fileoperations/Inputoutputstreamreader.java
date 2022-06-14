package com.codexbox.springboot.app.HarshaDeepthi.Fileoperations;

import java.io.*;

import static java.io.InputStream.*;

public class Inputoutputstreamreader  {
    public void findInputOutputOperations()  {
        InputStream istream = null;
        OutputStream ostream = null;

        try {
           istream =  new FileInputStream("abc.txt");
           ostream =  new FileOutputStream("xyz.txt");
            int asci = 0;
            while (asci != -1) {
                asci = istream.read();
                ostream.write(asci);

          /*  FileReader freader = new FileReader("abc.txt");
            BufferedReader breader = new BufferedReader(freader);
            for(int i=0;i<3;i++) {
                System.out.println(breader.readLine());
            }*/
                // Reader reader=new FileReader(bufferedInputStream.toString());
                // BufferedReader bufferedReader=new BufferedReader(reader);
                // System.out.println(bufferedReader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception please check your file is there are not");
        } catch (IOException s) {
            System.out.println(s);
        } finally {
            try {
                istream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
