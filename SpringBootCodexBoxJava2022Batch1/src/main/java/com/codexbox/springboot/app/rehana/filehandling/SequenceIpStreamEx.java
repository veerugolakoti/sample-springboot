package com.codexbox.springboot.app.rehana.filehandling;

import java.io.*;

public class SequenceIpStreamEx {
    public void sequence() throws IOException {
       InputStream inputStream1 =null;
       InputStream inputStream2 =null;
       SequenceInputStream sequenceInputStream = null;

        try {
            inputStream1 = new FileInputStream("sqncin.txt");
            inputStream2 = new FileInputStream("sqncout.txt");
            sequenceInputStream = new SequenceInputStream(inputStream1,   inputStream2);
            System.out.println(sequenceInputStream.available());
            System.out.println( sequenceInputStream.read());
            System.out.println( sequenceInputStream.skip(5));
            // sequenceInputStream.mark(3);
           // System.out.println(inputStream2.available());
            int j = 0;
            while (j!=-1){
                 j=sequenceInputStream.read();
                System.out.print( (char)j   );
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            inputStream1.close();
            inputStream2.close();
            sequenceInputStream.close();
        }

    }
}
