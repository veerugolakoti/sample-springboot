package fileinputoutputstream;

import java.io.*;
public class FileInputOutputExample {
    public void filecount () {
            try {
                FileReader fr = new FileReader("siva.txt");
                BufferedReader br = new BufferedReader(fr);
                br.readLine();
                System.out.println("the read value is "+ br.readLine());
                InputStream inputStream = new FileInputStream("siva.txt");
                inputStream.read();
                System.out.println("the file values are :"+ inputStream.read());


            } catch (Exception e) {
                System.out.println("the file not found ");
            }
        }

    }
