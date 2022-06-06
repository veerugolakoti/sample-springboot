package com.codexbox.springboot.app.sohailspringbootproject.collections;

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
        List<String> words = new ArrayList<>();
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            words.addAll(Arrays.asList(line.split(" ")));

        }
        findWordCount(words);
    }

    private static void findWordCount(List<String> words) {
        Map<String,Integer> myMap = new TreeMap<>();
        for (String word: words ) {
            if (myMap.containsKey(word)){
                myMap.put(word,myMap.get(word)+1);
            }
            else{
                myMap.put(word,1);
            }
        }
        List<Map.Entry<String,Integer>> wordlist = new ArrayList<>();
        Collections.sort(wordlist, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());}});
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}



