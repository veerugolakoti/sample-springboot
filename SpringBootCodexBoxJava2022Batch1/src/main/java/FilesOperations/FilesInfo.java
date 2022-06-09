package FilesOperations;
import java.io.*;

public class FilesInfo {
    public void filesInfo() {
        try {
            File file = new File("testFile.txt");
            file.createNewFile();
            System.out.println(file);
            File file2 =  file.getCanonicalFile();
            System.out.println(file2);
            boolean bool = file.exists();
            System.out.println(bool);
            if(bool) {
                System.out.println(file2 + " " + bool);
            } else {
                System.out.println("File does not exists");
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
