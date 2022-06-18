package FilesOperations;

import java.io.*;

public class WriterAndReader {
    Writer write;
    Reader read1;
    public void writerReader() {
        try {
            write = new FileWriter("OutputSample.txt");
            write.write("89");
            read1 = new FileReader("OutputSample.txt");
        } catch (IOException e) {
            System.out.println("Input output exeption");
        } finally {
            try {
                write.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
