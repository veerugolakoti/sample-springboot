package ioStream;

import java.io.*;

public class IOStreamExample {
    public void ioStreamEx() throws IOException {
        InputStream inputStream = null;
        InputStream inputStream1 = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("new.txt");
            inputStream1 = new FileInputStream("old.txt");
            outputStream = new FileOutputStream("file.txt");


//            System.out.println(inputStream.read());

            /*int[] array = new int[inputStream.available()];
            for (int i =0; i<array.length;i++){
                array[i] = inputStream.read();
            }
*/
            int asciiValue = 0;
            while (asciiValue != -1) {
                asciiValue = inputStream.read();
                outputStream.write(asciiValue);
            }
            outputStream.write(13);
            int asciiValue1 = 0;
            while(asciiValue1 != -1){
                asciiValue1 =inputStream1.read();
                outputStream.write(asciiValue1);

            }
        }
            catch(FileNotFoundException e){
                System.out.println("File Not found Exception occured");
            }catch(IOException e){
            throw new RuntimeException(e);
        }finally{
            inputStream.close();
            inputStream1.close();
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
