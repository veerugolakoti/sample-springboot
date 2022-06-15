package com.codexbox.springboot.app.TejaAravind.Streams;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;

public class ReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("abc.txt");
        BufferedReader bufferedReader =new BufferedReader(reader);
        FileWriter writer = new FileWriter("xyz.txt");
//        BufferedWriter write = new BufferedWriter(writer);
        Scanner in = new Scanner(System.in);
//        writer.write(in.nextLine());
        System.out.println(bufferedReader.readLine());
//
//        writer.write("\n"+in.nextLine());
        writer.flush();





    }
}
