package FilesOperationsChallenge;

import java.io.*;
import java.util.*;
public class BufferedReadMultipeLines {
    BufferedReader reader = null;
    public void multipleLines() {
        try {
            String path = "E:\\filesClasses.txt";
            reader = new BufferedReader(new FileReader(path));

            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Input output Exception");
        }
    }
}
