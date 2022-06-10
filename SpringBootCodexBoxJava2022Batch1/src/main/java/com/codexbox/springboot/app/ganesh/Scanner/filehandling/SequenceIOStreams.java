package com.codexbox.springboot.app.ganesh.Scanner.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class SequenceIOStreams {


    public SequenceIOStreams(FileInputStream fis1, FileInputStream fis2,
                             FileInputStream fis3, FileInputStream fis4) {
    }

    public void sios() throws IOException {

        FileInputStream fis1 = new FileInputStream("C:\\mafia.txt");
        FileInputStream fis2 = new FileInputStream("D:\\inputfile.txt");
        FileInputStream fis3 = new FileInputStream("gun.txt");
        FileInputStream fis4 = new FileInputStream("D:\\sangam.txt");
        SequenceIOStreams sios = new SequenceIOStreams(fis1,fis2,fis3,fis4);





    }




    }

