package com.codexbox.springboot.app.vidyadarna.fileInputOutput;

import java.io.*;
import java.util.Scanner;

public class InputOutputStreamExample {
    public void inputOutputStreamExample() throws IOException {
        // byte[] array = new byte[1000];
//        InputOutputStreamExample example = new InputOutputStreamExample();
        InputStream input = null;
        OutputStream output = null;
        InputStream  inputStream1 = null;
       // OutputStream outputStream1 = null;
       File file = new File("cc.txt");
        Scanner sc = new Scanner(file);
//        sc.nextInt();

////        sc.nextInt();
////        System.out.println("enter text value " +sc);
        try {
            input = new FileInputStream("abc.txt");
            inputStream1 = new FileInputStream ("cc.txt") ;
//            FileReader reader = new FileReader("vidya.txt");
            output = new FileOutputStream("vidya.txt");
//            FileWriter writer = new FileWriter("abc.txt");

          //  outputStream1 = new FileOutputStream("vv");

            //   System.out.println("the input stream " + input.read());
            int value = 0;

            while (value != -1){
                value = input.read();
             //   System.out.println(value);
                output.write(value);

            }
            //int value1 = 0;
//            while (value1 !=-1){
//                value1=inputStream1.read();
//              //  outputStream1.write(value1);
//                output.write(value1);
//            }
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
            //  } catch (IOException e) {
            //   throw new RuntimeException(e);
        }
        finally {

            input.close();
            output.close();
            inputStream1.close();
        }
    }

}