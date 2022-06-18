package com.codexbox.springboot.app.Veeru;

import com.codexbox.springboot.app.Veeru.Collections.WordComparator;

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
        List<String> words = new ArrayList<>();
        while (true) {

            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            words.addAll(Arrays.asList(line.split(" ")) );
        }
        findWordCount(words);
    }

    private static void findWordCount(List<String> words) {

        Map<String, Integer> words1 = new HashMap<>();
        for (String str : words) {
            if (words1.containsKey(str)) {
                words1.put(str, 1 + words1.get(str));
            } else {
                words1.put(str, 1);
            }
        }

        List<Map.Entry<String,Integer>> list =new ArrayList<>(words1.entrySet());

        Collections.sort(list,new WordComparator());
        for ( Map.Entry<String,Integer> var3: words1.entrySet()) {
            System.out.println(var3.getKey() + " : "  + var3.getValue());
        }
    }
}
