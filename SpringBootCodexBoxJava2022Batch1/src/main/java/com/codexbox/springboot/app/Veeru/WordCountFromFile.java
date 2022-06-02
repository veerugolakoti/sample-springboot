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
        ArrayList<String[]> arr=new ArrayList<>();
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            arr.add(line.split(" "));
        }
        ArrayList<String> num=new ArrayList<>();
        for (int i=0;i<arr.size();i++){
            for (String str:arr.get(i)) {
                num.add(str);
            }
        }
        findWordCount(num);
    }
    private static void findWordCount( ArrayList<String> num) {

        Map<String, Integer> wordMap = new TreeMap<>();
        for (String word : num) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

            List<Map.Entry<String,Integer>> entryList=new ArrayList<>(wordMap.entrySet());
            Collections.sort(entryList,new WordComparator());

            for (Map.Entry<String, Integer> entry : entryList){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }





