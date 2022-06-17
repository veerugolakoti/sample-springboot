package com.codexbox.springboot.app.abhilash.filehandling;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceinputExample {
    FileInputStream fi1 = null;
    FileInputStream fi2 = null;
    FileInputStream fi3 = null;
    SequenceInputStream si = null;
    public void sequenceEx() {
        try {
            fi1 = new FileInputStream("abc.txt");
            fi2 = new FileInputStream("second.txt");
            fi3 = new FileInputStream("dcb.txt");

            Vector<FileInputStream> list = new Vector<>();
            list.add(fi1);
            list.add(fi2);
            list.add(fi3);

            Enumeration<FileInputStream> e = list.elements();
            si = new SequenceInputStream(e);
            int i ;
            while((i= si.read())!= -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
