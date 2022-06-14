package com.codexbox.springboot.app.Veeru;

import org.apache.logging.log4j.util.PropertySource;

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
            System.out.println("Specified file not found in location : " + filePath);
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
     Map<String,Integer>wordcount=new HashMap<>();
        for (String str:words) {
            if (wordcount.containsKey(str)) {
                wordcount.put(str, wordcount.get(str) + 1);

            } else {
                wordcount.put(str, 1);
            }

        }
        List<Map.Entry<String,Integer>>wordlist=new ArrayList<>(wordcount.entrySet());
        Collections.sort(wordlist, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String,Integer> entry:wordlist) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
    }

