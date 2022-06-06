package com.codexbox.springboot.app.Veeru;

import com.codexbox.springboot.app.Veeru.Collections.MyCompartor;

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

    private static void findWordCount(String[] words) {
        Map<String, Integer> wordCountMap = new TreeMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1); // Veeru 3
            } else {
                wordCountMap.put(word, 1);// veeru 1
            }
        }
        List<Map.Entry<String, Integer>> wordCountList = new ArrayList<>(wordCountMap.entrySet());
        System.out.println("Before Sorting my values are : ");
        for (Map.Entry<String, Integer> entry : wordCountList) {
            System.out.println(entry.getKey() + " : " +  entry.getValue());
        }
        Collections.sort(wordCountList, new MyCompartor());

        System.out.println("After Sorting my values are : ");
        for (Map.Entry<String, Integer> entry : wordCountList) {
            System.out.println(entry.getKey() + " : " +  entry.getValue());
        }

    }
}
