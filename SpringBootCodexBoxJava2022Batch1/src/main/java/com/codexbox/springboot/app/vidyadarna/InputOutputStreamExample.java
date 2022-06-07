package com.codexbox.springboot.app.vidyadarna;

import java.io.*;

public class InputOutputStreamExample {
    public void inputOutputStreamExample() throws IOException {
        // byte[] array = new byte[1000];
//        InputOutputStreamExample example = new InputOutputStreamExample();
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream("abc.txt");
            output = new FileOutputStream("vidya.txt");
//            FileReader reader = new FileReader("vidya.txt");
//            FileWriter writer = new FileWriter("vv");
         //   System.out.println("the input stream " + input.read());
            int value = 0;
            while (value != -1){
              value = input.read();

              output.write(value);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {

            input.close();
            output.close();
        }
    }

}