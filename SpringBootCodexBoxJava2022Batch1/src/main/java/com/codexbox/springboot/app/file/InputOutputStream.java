package com.codexbox.springboot.app.file;

import java.io.*;

public class InputOutputStream {
    public void iooperation()  {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {

             inputStream = new FileInputStream("examplefile.txt");
             outputStream = new FileOutputStream("sample.txt");


            //InputStream inputoutStream = new FileInputStream("examplefile.txt.txt");
            // BufferedInputStream bufferedInputStream=new BufferedInputStream(inputoutStream);
           /* FileReader reader=new FileReader("examplefile.txt");
            BufferedReader bufferedReader=new BufferedReader(reader);
            System.out.println(bufferedReader.readLine());*/

            int asci = 0;
            while (asci != -1) {
                asci = inputStream.read();
                outputStream.write(asci);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found exception");
        } catch (IOException e) {
            System.out.println("this is my file");
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            }
            catch(IOException e){
                System.out.println(" IOException occured");
            }
        }
    }}
