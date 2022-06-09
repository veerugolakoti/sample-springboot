package com.codexbox.springboot.app.abhilash.filehandling;

import org.junit.Test;

import javax.sound.midi.Sequence;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UsingStreams {
    @Test
     public void streams() throws IOException {
         InputStream inputStream = Files.newInputStream(Paths.get("abc.txt"));
         InputStream inputStream1 = Files.newInputStream(Paths.get("dcb.txt"));
         BufferedInputStream ip = new BufferedInputStream(inputStream);
         OutputStream os = Files.newOutputStream(Paths.get("second.txt"));
         BufferedOutputStream op = new BufferedOutputStream(os);
         op.write('d');
         String str = "filoutputstream used to write content";
         byte b[] = str.getBytes();
         op.write(b);
         op.flush();
         int i = 0;
         while(i != -1) {
             i = ip.read();
             // if we take numbers in abc.txt it is printing numbers. because for every iteration
             // it is taking one character.
             System.out.print((char)i);
             os.write(i);
         }
        System.out.println();
        SequenceInputStream si = new SequenceInputStream(inputStream, inputStream1);
        int j = 0;
        while((j = si.read())!= -1) {
            System.out.print((char)j);

        }
        inputStream.close();
        inputStream1.close();
        ip.close();
        os.close();
        si.close();
        op.close();

     }
}
