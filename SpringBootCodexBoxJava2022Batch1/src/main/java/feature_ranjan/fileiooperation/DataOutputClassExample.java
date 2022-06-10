package feature_ranjan.fileiooperation;

import java.io.*;

public class DataOutputClassExample {
    public void dataOutputClass() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Exust.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.write(76);
        dataOutputStream.write(65);
        dataOutputStream.write(78);
        dataOutputStream.write(90);
        dataOutputStream.flush();

        FileInputStream fileInputStream = new FileInputStream("exust.txt");
        DataInputStream  dataInputStream = new DataInputStream(fileInputStream);
        int i;
        while ((i = dataInputStream.read()) != -1){
            System.out.println("value : "+(char)i);
            System.out.println("ASCII code : "+i);
        }

    }
}
