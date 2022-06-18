package FilesOperationsChallenge;
import java.io.*;

public class CopyContentToAnother {
    public void copyContent() {
        try {
            InputStream isteram = new FileInputStream("Simple.txt");
            OutputStream ostream = new FileOutputStream("Outputs.txt");

            int i;
            while ((i = isteram.read()) != -1) {
                ostream.write(i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
