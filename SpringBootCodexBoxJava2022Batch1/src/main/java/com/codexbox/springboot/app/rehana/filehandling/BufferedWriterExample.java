package com.codexbox.springboot.app.rehana.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public  void write() throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter("bfrwout.txt");
             bufferedWriter = new BufferedWriter(fileWriter);
             bufferedWriter.write("welcome");
            // bufferedWriter.write("welcome");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter.close();
            bufferedWriter.close();

        }
    }
}
