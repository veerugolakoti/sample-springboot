package FileOperations;

import java.io.*;

public class InputOutputStream {
    public void inputOutputOperations() throws IOException {

        InputStream inputStream = null;
        OutputStream outputStream=null;
        try {
            inputStream = new FileInputStream("bbc.txt");
            outputStream = new FileOutputStream("ranjan.txt");
            System.out.println(inputStream.read());
            int info = 0;
            while (info != -1) {
                info = inputStream.read();
                outputStream.write(info);
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


          /* File file1=new File("bbc.txt");
           FileReader file=new FileReader("bbc.txt");
           InputStream ioexample = new FileInputStream("bbc.txt");
          BufferedReader buffer1=new BufferedReader(file);
           System.out.println(buffer1.readLine());*/

//           BufferedInputStream  buffer=new BufferedInputStream(ioexample);
           /*FileWriter writer=new FileWriter("bbc.txt");
           writer.write("nagarjuna");
           writer.close();
           System.out.println("exception not occured");*/
          /* if(file1.createNewFile()){
               System.out.println("file  existed");
           } else {
               System.out.println("file not existed");*/

//           } /*System.out.println(file.read());
          /* System.out.println(ioexample.read());
           System.out.println(ioexample.available());
           System.out.println(buffer1.read());*/
//       }
      /* catch (FileNotFoundException e){
       System.out.println("my exception is file not exception if my file is not present ");
       } catch (IOException e) {
           System.out.println("my exception");
       }
*/

    }
}


