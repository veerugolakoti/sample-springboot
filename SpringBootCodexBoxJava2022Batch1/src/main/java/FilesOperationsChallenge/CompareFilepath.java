package FilesOperationsChallenge;

import java.io.*;

public class CompareFilepath {
    public void comparePath() {
        File freader = new File("newfile.txt");
        File freader2 = new File("filesset.txt");
        if(freader.compareTo(freader2) == 0) {
            System.out.println("Files paths are sdame");
        } else {
            System.out.println("File paths are npot same");
        }
    }
}
