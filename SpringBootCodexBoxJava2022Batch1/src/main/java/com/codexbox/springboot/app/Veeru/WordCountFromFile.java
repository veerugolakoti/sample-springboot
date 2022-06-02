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
        List<String[]> words = new ArrayList<>();
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            words.add(line.split(" "));
        }
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0;i < words.size(); i++ ){
            for(String string:words.get(i)){
                lines.add(string);
            }
        }
       findWordCount(lines);
    }

    private static void findWordCount(ArrayList<String> words)  {
        Map<String, Integer> stringConut = new HashMap<>();
        for (String word : words) {
            if (stringConut.containsKey(word)) {
                stringConut.put(word, stringConut.get(word) + 1);
            } else {
                stringConut.put(word, 1);
            }
        }
            //System.out.println(stringConut.entrySet());
           List<Map.Entry<String,Integer>> list= new ArrayList<>(stringConut.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
        for (Map.Entry<String,Integer> entry:list) {

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        }


    }

