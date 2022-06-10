package FilesOperationsChallenge;
import java.io.*;


public class RenameFile {
    public void renamefile() {
        File file = new File("ArrayFile.txt");
        File renameFile = new File("newArray.txt");
        boolean renamed = file.renameTo(renameFile);
        if(renamed == true) {
            System.out.println("Renamed success");
        } else {
            System.out.println("Not renamed");
        }
    }
}
