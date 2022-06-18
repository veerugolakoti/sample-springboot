package FilesOperations;
import java.io.*;
import java.util.*;

public class ReadAfile {
    InputStream istream = null;
    OutputStream ostream = null;
    public void readaFile() {
        try {

            istream = new FileInputStream("Simple.txt");
            ostream = new FileOutputStream("Output.txt");
            int data = 0;
            while((data = istream.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("This is IO exception");
        } finally {
            try {
                istream.close();
            } catch (IOException e) {
                System.out.println("IO wxception");
            }
        }
    }
}
