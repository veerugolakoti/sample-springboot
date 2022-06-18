package feature_ranjan.fileiooperation;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamExample {
    public void byteArrayOutput() throws IOException {
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        BufferedOutputStream bufferOutputStream = null;
        ByteArrayOutputStream byteArray = null;
        try {
            fileOutputStream = new FileOutputStream("codex.txt");

            bufferOutputStream = new BufferedOutputStream(fileOutputStream);

            String s = "Hi boys, it's party to night ";
            byte b[] = s.getBytes();
            bufferOutputStream.write(b);

            fileOutputStream2 = new FileOutputStream("smruti.txt");

            byteArray = new ByteArrayOutputStream();
            byteArray.write(51);
            byteArray.write(67);
            byteArray.writeTo(fileOutputStream);
            byteArray.writeTo(fileOutputStream2);

            byteArray.close();
            byteArray.flush();


        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            byteArray.close();

        }
    }
}
