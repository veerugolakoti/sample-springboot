package com.codexbox.springboot.app.codexbox.Assesment3.filehandling;

import java.io.*;

public class InputOutputStream {
    public void fileInputOutputStream() throws IOException {
        InputStream inpustream = null;
        OutputStream outputStream = null;
        try {
            inpustream = new FileInputStream("bhargav.txt");
            outputStream = new FileOutputStream("teja.txt");
            int ips = 0;
            while (ips != -1){
                ips = inpustream.read();
                outputStream.write(ips);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException is occured pls check the file");
        }
        catch (IOException io){
            throw new RuntimeException(io);
        } finally {
            inpustream.close();
        }
    }
}
