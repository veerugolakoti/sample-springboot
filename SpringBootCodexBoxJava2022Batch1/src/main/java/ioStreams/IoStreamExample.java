package ioStreams;

import java.io.*;

public class IoStreamExample {
    public void myIostreem() throws IOException {
        InputStream inputStream=null;
        InputStream inputStream1 = null;
        OutputStream outputStream=null;
        try {
            inputStream=new FileInputStream("abc.txt");
            inputStream1=new FileInputStream("klm.txt");
            outputStream=new FileOutputStream("ijk.txt");

            int Asci=0;
            while (Asci != -1) {
                Asci = inputStream.read();
                outputStream.write(Asci);
            }
            outputStream.write(13);
            int Asci1=0;
            while (Asci1 != -1) {
                Asci1 = inputStream1.read();
                outputStream.write(Asci1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            inputStream1.close();
            inputStream.close();
            outputStream.close();
        }
    }
}
