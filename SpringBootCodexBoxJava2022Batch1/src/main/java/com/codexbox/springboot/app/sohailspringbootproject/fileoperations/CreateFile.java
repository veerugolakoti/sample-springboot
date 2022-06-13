package com.codexbox.springboot.app.sohailspringbootproject.fileoperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public void createFileMethod(){
        File file = new File("E:newFile.txt");
        try{
            if(file.createNewFile()) {
                System.out.println("THE new file is created successfully");
            }
            else{
                System.out.println("the file already exists ");
            }
        }
        catch(IOException ex){
            System.out.println("IO Exception Occurred");
        }
    }
}
