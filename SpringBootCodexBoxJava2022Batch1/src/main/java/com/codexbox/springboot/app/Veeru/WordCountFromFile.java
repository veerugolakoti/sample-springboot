package com.codexbox.springboot.app.Veeru;

import java.io.*;
import java.util.*;

public class WordCountFromFile {
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
        private static void findWordCount(String[] words){
            Map<String, Integer> word = new HashMap<>();

            for (String wordcount1 : words) {
                if (word.containsKey(wordcount1)) {
                    word.put(wordcount1, word.get(wordcount1) + 1);
                } else {
                    word.put(wordcount1, 1);
                }
//            System.out.println(wordcount1);
            }
            System.out.println(word);
        }
    }







