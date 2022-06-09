package FilesOperations;

import java.io.*;

public class WriteaFile {
    InputStream istream = null;
    OutputStream ostream = null;
    public void writeFile() {
        try {
            istream = new FileInputStream("Simple.txt");
            ostream = new FileOutputStream("Output.txt");
            int data = 0;
            while(data != -1) {
                data = istream.read();
                ostream.write(data);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
