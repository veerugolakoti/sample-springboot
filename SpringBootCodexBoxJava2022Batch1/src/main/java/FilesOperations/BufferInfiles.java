package FilesOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferInfiles {
    FileReader reader;
    BufferedReader buffer;
    public void buffersfiles() {
        try {
            reader = new FileReader("Simple.txt");
            buffer = new BufferedReader(reader);
            while (buffer.read() != -1) {
                System.out.println(buffer.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            System.out.println("Input output exceptions");
        }
    }
}
