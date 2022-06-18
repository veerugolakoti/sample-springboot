package FilesOperations;

import java.io.*;

public class WriteArrayToFiles {
    OutputStream ostreams = null;
    ByteArrayOutputStream byteStrem = null;
    DataOutputStream dataStream = null;
    public void writearray() {
        try {
            ostreams = new FileOutputStream("ArrayFile.txt");
            String str = "1234";
            byte[] arr = str.getBytes();
            ostreams.write(arr);
        } catch (FileNotFoundException e) {
            System.out.println("File not find");
        } catch (IOException e) {
            System.out.println("Input and output exception");
        } finally {
            try {
                ostreams.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
