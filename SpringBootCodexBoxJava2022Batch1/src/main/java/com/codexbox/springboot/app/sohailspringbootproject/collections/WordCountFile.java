package com.codexbox.springboot.app.sohailspringbootproject.collections;

import com.codexbox.springboot.app.Veeru.WordCountFromFile;

import java.io.*;
import java.util.*;

public class WordCountFile {
    public static void main(String[] args) {
        System.out.println("This program will count the words from the input file specified in path");
        if (args.length == 0) {
            System.err.println("No input file path given, Please provide input file path through command line arguments");
            return;
        }
        String filePath = args[0];
        File file = new File(filePath);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("Specifed file not found in location : " + filePath);
            e.printStackTrace();
        }

        String line = null;
        String[] words = null;
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            words = line.split(" ");
            findWordCount(words);
        }
    }

    private static void findWordCount(String[] words) {
        Map<Integer, WordCountFile> map = new HashMap<>();




        for (Map.Entry<Integer, WordCountFile> entry : map.entrySet()) {

            System.out.println("My key: " + entry.getKey() + " My Value " + entry.getValue());

       /* treeset.add(words);
        for (int i=0;i<words.length;i++){*/
        }
    }
}


