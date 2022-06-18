package FilesOperations;

import java.io.*;

public class FilesList {
    public void filesList() {
        File fileList = new File("E:\\JavaFilesPrograms");
        String[] fileLists = fileList.list();
        for (String files : fileLists) {
            System.out.println(files);
        }
    }
}
