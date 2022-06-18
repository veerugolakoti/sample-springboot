package FilesOperationsChallenge;
import java.io.*;


public class SetReadable {
    public void setreadable() throws IOException {
        File files = new File("filesset.txt");
        files.createNewFile();
         boolean flag = files.setReadOnly();

        System.out.println(flag);
        System.out.println(files.canWrite());
    }
}
