package ioStream;

import java.io.*;

public class IOStreamExample {
    public void ioStreamEx() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("new.txt");
            outputStream = new FileOutputStream("old.txt");
//            System.out.println(inputStream.read());

            int asciiValue = 0;
            while (asciiValue != -1) {
                asciiValue = inputStream.read();
                outputStream.write(asciiValue);
            }
        }
            catch(FileNotFoundException e){
                System.out.println("File Not found Exception occured");
            }catch(IOException e){
            throw new RuntimeException(e);
        }finally{
            inputStream.close();
            outputStream.close();
        }}}












    /*   //byte [] array = new byte[10];
        try {
            FileReader freader = new FileReader("new.txt");
            BufferedReader breader = new BufferedReader(freader);
            System.out.println(breader.readLine());
            //InputStream input = new FileInputStream("new.txt");
            System.out.println(input.read());*/



/*

        } catch (Exception e ){

            System.out.println("file is not found");
        }
            }
        }

*/
