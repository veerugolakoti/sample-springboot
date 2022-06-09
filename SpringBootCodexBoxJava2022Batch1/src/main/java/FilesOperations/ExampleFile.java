package FilesOperations;
import java.io.*;


public class ExampleFile {
    OutputStream otream = null;
    public void fileMeth() {
        try {
            otream = new FileOutputStream("Numbers.txt");
            otream.write(34);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
