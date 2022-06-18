package FilesOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Fileread {
    Reader reader;
    public void fileread() {
        try {
            reader = new FileReader("OutputSample.txt");
            int data = 0;
            while ((data = reader.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception");
        } catch (IOException e) {
            System.out.println("input output exception");
        }
    }
}
