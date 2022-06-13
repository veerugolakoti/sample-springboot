package fileInputStream;

import java.io.*;

public class FileInputStream {
    public void testmethods() {
        try {
            FileReader Reader = new FileReader("ramesh.txt");
            BufferedReader read = new BufferedReader(Reader);
            System.out.println("the files contains vaules are : "+read.readLine());
            InputStream inputStream = new java.io.FileInputStream("ramesh.txt");
            System.out.println("input stream values are :"+inputStream.read());
            System.out.println(read.ready());

        }
            catch(FileNotFoundException e){

            } catch(IOException e){
                System.out.println("file Not Exceptioon");
            }
        }


    }


