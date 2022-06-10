package FilesOperationsChallenge;
import java.io.*;


public class CreateFile {
    BufferedReader buffer = null;
    FileReader reader = null;
    File file = null;
    public void createFile() {
        file = new File("newfile.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File is craeted");
            } else {
                System.out.println("File existed");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
