package com.codexbox.springboot.app.abhilash.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    FileWriter fw = null;
    public void example() throws IOException {
        try {
            fw = new FileWriter("second.txt");
            fw.write("name: Abhilash\n");
            fw.write("id: 22082\n");
            fw.write("hyd");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            fw.close();
        }


    }
}
