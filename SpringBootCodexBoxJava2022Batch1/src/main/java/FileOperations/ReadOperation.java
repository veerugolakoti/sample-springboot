package FileOperations;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadOperation {
    public void inputOutputOperations() {
        try {
            File fr=new File("jani.txt");
            Scanner sc=new Scanner(fr);
            while (sc.hasNextLine()) {
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("my exception");
            e.printStackTrace();







































        }
    }
}
