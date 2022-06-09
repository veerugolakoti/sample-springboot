package ioStreams;

import java.io.*;

public class ArrayStream {
    public void myArrayStream() throws Exception {
       /* FileOutputStream fi=new FileOutputStream("mno.txt");
        ByteArrayOutputStream bas=new ByteArrayOutputStream();*/
        byte[] st={ 32,33,34,35,96,20,'a','b','c','d','e','f','g','h','i','j','k','l'};
        ByteArrayInputStream bas=new ByteArrayInputStream(st);
        int i=0;
        while((i=bas.read())!=-1){
            char ch= (char)i;
            System.out.println(ch+"  : " +i);

        }
        bas.close();

    }
}
