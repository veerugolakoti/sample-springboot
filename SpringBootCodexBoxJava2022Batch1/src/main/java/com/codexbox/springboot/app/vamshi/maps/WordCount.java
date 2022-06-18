package com.codexbox.springboot.app.vamshi.maps;

import java.io.*;
import java.util.*;

public class WordCount {

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
        Map<String, Integer> countofMap = new HashMap<>();
        for (String e : words) {
            if (countofMap.containsKey(e)) {
                countofMap.put(e, countofMap.get(e) + 1);
            } else {
                countofMap.put(e, 1);
            }
        }
        System.out.println(countofMap);
    }
    private static void sortformap(Map<String,Integer>countofMap){
        List<Map.Entry<String,Integer>> listofword = new ArrayList<>(countofMap.entrySet());
        Collections.sort(listofword, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String,Integer>entry : listofword) {
            System.out.println("My key: " + entry.getKey( ) + " My Value " + entry.getValue());
            ;
        }
    }
}

