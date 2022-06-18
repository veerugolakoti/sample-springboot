package FilesOperations;
import java.io.*;


public class CreateFile {
    public void createFile() {
        File file = new File("newfile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("New file is created");
            } else {
                System.out.println("Already file exists");
            }
        } catch (IOException e) {
            System.out.println("Path not found");
        }
    }
}
