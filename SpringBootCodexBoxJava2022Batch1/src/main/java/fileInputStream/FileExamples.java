package fileInputStream;
import java.io.*;
import java.io.FileInputStream;

public class FileExamples {
    public void testmethods() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            InputStream inputStream1 = new FileInputStream("ramesh1.txt");
            OutputStream outputStream1 = new FileOutputStream("ramesh.txt");
            System.out.println("the file value is print:" + inputStream1.read());
            int assci = 0;
            while (assci !=-1){
                assci = inputStream.read();
                outputStream.write(assci);}
        } catch (FileNotFoundException e){
            System.out.println("the file not found excepyion :");
        } catch (IOException e ) {
            throw new RuntimeException();
        }
            finally{
             inputStream.close();
             outputStream.close();
            }
        }
        }
