package feature_ranjan.fileiooperation;

import java.io.*;

public class InputOutputExample {
    public void fileInputOutput() throws IOException {

        //  InputStream inputStream = new InputStream();
        InputStream inputStream1 = null;
        OutputStream outputStream = null;
        try {
            /*inputStream1 = new FileInputStream("smruti.txt");
            outputStream = new FileOutputStream("ranjan.txt");
            System.out.println("inputStream "+inputStream1.read());
            System.out.println("available "+inputStream1.available());

            int ascii = 0;
            while (ascii != -1) {

                ascii = inputStream1.read();
                outputStream.write(ascii);

            }
            System.out.println("inputStream using while : " + inputStream1.read());
            System.out.println("mark supported "+inputStream1.markSupported());
            System.out.println("skip "+inputStream1.skip(45));

            FileReader fileReader = new FileReader("smruti.txt");
            System.out.println("fileReader "+fileReader.read());

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("buffered reader readline : " + bufferedReader.readLine());

            System.out.println("buffered reader line "+bufferedReader.lines());

         *//*  PrintStream printStream = new PrintStream("smruti.txt");
           printStream.println();
           System.out.println(printStream.append());*//*

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream1);
            System.out.println("input stream reader: "+inputStreamReader.read());

            StringReader stringReader = new StringReader("smruti");
            System.out.println("String reader : "+stringReader.equals(inputStreamReader));

            File file = new File("smruti.txt");
            System.out.println("File canExecute() : "+file.canExecute());*/



            FileInputStream fileInputStream = new FileInputStream("smruti.txt");
           // BufferedReader bufferedReader = new (fileInputStream);

            System.out.println(" file channel :"+fileInputStream.getChannel());
            System.out.println(fileInputStream.getFD());

            PrintStream printStream = new PrintStream("smruti.txt");
            //System.out.println(printStream.write());

         /*   FileOutputStream fileOutputStream = new FileOutputStream("smruti.txt");
            System.out.println("equals method :"+fileOutputStream.);*/

            InputStreamReader inputStreamReader =  new InputStreamReader(fileInputStream);
            System.out.println(inputStreamReader.getEncoding());
           // System.out.println(inputStreamReader.mark());




        }
        catch (FileNotFoundException e) {
            System.out.println("file not found rxception :");
        }
        catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        /*finally {
            inputStream1.close();
            outputStream.close();

        }
*/

    }
}
