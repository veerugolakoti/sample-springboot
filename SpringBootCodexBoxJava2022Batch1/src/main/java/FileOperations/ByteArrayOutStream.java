package FileOperations;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutStream {
    public void inputOutputOperations() {
        try {
            String str="nagarjuna";
            FileOutputStream fos = new FileOutputStream("knl.txt");
            FileOutputStream fos1 = new FileOutputStream("gmr.txt");
            ByteArrayOutputStream bao=new ByteArrayOutputStream();
            bao.write(Integer.parseInt(str));
            bao.writeTo(fos);
            bao.writeTo(fos1);

              bao.close();
        }catch (NumberFormatException e){
            System.out.println("my number format exception");
        }
        catch(IOException e){
            System.out.println("my exception");

        }
    }
}
