package ioStreams;

import java.io.*;

public class IoStreamExample {
    public void myIostreem() throws IOException {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            inputStream=new FileInputStream("klm.txt");
            inputStream=new FileInputStream("abc.txt");
            outputStream=new FileOutputStream("ijk.txt");

            int inputAcsi=0,inputAc=0;
            while (inputAcsi !=-1|| inputAc != -1){
                if(inputAcsi !=-1) {
                    inputAcsi = inputStream.read();
                    outputStream.write(inputAcsi);
                }
                if (inputAc !=-1){
                    inputAc = inputStream.read();
                    outputStream.write(inputAc);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
