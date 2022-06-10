package feature_ranjan.fileiooperation;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {
    public void bufferOutput() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("smruti.txt");
        BufferedOutputStream bufferOutputStream = new BufferedOutputStream(fileOutputStream);
        String str = "new text file created ";
        byte b[] = str.getBytes();
        bufferOutputStream.write(b);
        bufferOutputStream.flush();
        System.out.println("check the text file :");
    }
}
