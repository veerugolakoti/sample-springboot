package FilesOperationsChallenge;
import java.io.*;

public class CreateTemp {
    public void tempFile() throws IOException {
                String prefix = "textFiles2";

                String suffix = ".txt";

                File directoryPath = new File(
                        "E:\\");

                File tempFile = File.createTempFile(prefix, suffix,
                        directoryPath);
                tempFile.delete();
    }
}

