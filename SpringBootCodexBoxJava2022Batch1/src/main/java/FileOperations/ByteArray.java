package FileOperations;

import java.io.ByteArrayInputStream;

public class ByteArray {
    public void inputOutputOperations() {
        byte[] b={35,56,91,122};
        ByteArrayInputStream bai=new ByteArrayInputStream(b);
        int i;
        while((i=bai.read())!=-1) {
            char c=(char)i;
            System.out.println("Ascii value of "+i+ ";special character is :"+c);
        }


    }
}
