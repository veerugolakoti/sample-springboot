package feature_ranjan.fileiooperation;

import java.io.*;

public class ByteArrayInputStreamExample {
    public void byteArrayInputStream(){
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        try{
            fileOutputStream = new FileOutputStream("RenukaFile.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String str = "Renuka like Biryani";
            byte[] b = str.getBytes();
            bufferedOutputStream.write(b);
            bufferedOutputStream.flush();

            byteArrayInputStream = new ByteArrayInputStream(b);
            int k = 0;
            while ((k = byteArrayInputStream.read()) != -1){
                System.out.println("ASCII value : "+k);
                System.out.println("value : "+(char)k);

            }
        }catch (IOException e){

        }
    }
}
