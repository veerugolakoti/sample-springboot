package feature_ranjan.fileiooperation;

import java.io.*;

public class SequenceInputStramExample {
    public void sequenceInput(){
        try {
            FileInputStream fileInputStream1 = new FileInputStream("smruti.txt");
            FileInputStream fileInputStream2 = new FileInputStream("ranjan.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
            FileOutputStream fileOutputStream = new FileOutputStream("Sethi.txt");

            int j;
            while((j = sequenceInputStream.read())!= -1){

                fileOutputStream.write(j);
                System.out.print((char)j);
            }
        }   catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
