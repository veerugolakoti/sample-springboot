package FilesOperations;
import java.io.*;
import java.util.*;

public class FileIOOperations {

    InputStream istream = null;
    OutputStream ostream = null;
    public void filesoperations() {
        try {
             istream = new FileInputStream("Simple.txt");
             ostream = new FileOutputStream("Output.txt");


             int data = 0;
             while (data != -1) {
                data = istream.read();
                ostream.write(data);
            }



        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            System.out.println("File not found to read");
        } finally {
            try {
                istream.close();
            } catch (IOException e) {
                System.out.println("Close method is done");
            }
            try {
                istream.close();
            } catch (IOException e) {
                System.out.println("Close method is not done");
            }
        }
    }
}
