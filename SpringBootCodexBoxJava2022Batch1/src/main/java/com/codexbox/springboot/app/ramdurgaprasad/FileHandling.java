package com.codexbox.springboot.app.ramdurgaprasad;

import java.io.*;

public class FileHandling {
    public void InputOutputHandling() throws IOException {
        InputStream inputStream =null;
        InputStream inputStream1 = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("ram.txt");
            inputStream1 = new FileInputStream("rams.txt");
            outputStream = new FileOutputStream("prdp.txt");



            int ascii = 1,ascii2=1;
            while(ascii2!=-1){
                ascii2=inputStream1.read();
                outputStream.write(ascii2);
                if(ascii==-1){
                    ascii =inputStream.read();
                    outputStream.write(ascii);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("runtime exception is occured");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {

            FileReader fileReader = new FileReader("ram.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            while(true){
                String lines = bufferedReader.readLine();
                if(lines == null){
                    break;
                }int vowels = 0,consonants =0,spaces=0;
                System.out.println(lines);
                lines = lines.toLowerCase();
                for(int i=0;i<lines.length();i++){
                    char ch= lines.charAt(i);
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                        vowels++;
                    }else if(ch>= 'a'||ch<='z'){
                        consonants++;
                    }else if(ch==' '){
                        spaces++;}
                } System.out.println("the number of vowels in the text file:" +vowels);
                System.out.println("the number of  consonants in the file :" +consonants);
                System.out.println("the number of spaces in the text :" +spaces);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" file is not found ,please check the file and try again");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            outputStream.close();
            inputStream.close();
        }

    }
}