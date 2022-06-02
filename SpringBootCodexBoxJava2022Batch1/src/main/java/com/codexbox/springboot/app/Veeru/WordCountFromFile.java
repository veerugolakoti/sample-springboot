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
        List<String> words =new ArrayList<>();
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

        Map<String, Integer> word = new HashMap<>();
        for (String str : words) {
            if (word.containsKey(str)) {
                word.put(str, 1 + word.get(str));
            } else {
                word.put(str, 1);

            }
        }

        List<Map.Entry<String, Integer>> wordcount = new ArrayList<>(word.entrySet());
        Collections.sort(wordcount,new MyComparator());

        for (Map.Entry<String,Integer> count : wordcount){
            System.out.println( count.getValue()+" "+count.getKey());

        }
    }

}

