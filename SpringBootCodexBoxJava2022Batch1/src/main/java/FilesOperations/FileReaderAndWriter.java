package FilesOperations;
import java.io.*;

public class FileReaderAndWriter {
    FileReader reader;
    FileWriter writer;
    public void fileRandW() {
        try {
            reader = new FileReader("Simple.txt");
            writer = new FileWriter("Output.txt");
            int data2 ;
            while ((data2 = reader.read()) != -1) {
                writer.write(data2);
            }
            System.out.println("Done....");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("input or output exception");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
