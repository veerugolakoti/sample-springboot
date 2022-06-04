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

        List<String[]>array = new ArrayList<>();
        
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            
             array.add(line.split(" ")) ; 

        }
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            for (String ht:array.get(i)) {
                list.add(ht);
            }

        }
        findWordCount(list);
    }

    private static void findWordCount(ArrayList<String> list) {

        Map<String,Integer> word = new TreeMap<>();
        for ( String letter:list) {
            if (word.containsKey(letter))
            {
                word.put(letter,word.get(letter)+1 );

            } else {word.put(letter,1);



            }


        }
        System.out.println(word);
        List <Map.Entry<String,Integer>> entry = new Vector<>(word.entrySet());
        Collections.sort(entry, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String,Integer> entry1:entry) {
            System.out.println(entry1.getKey()+entry1.getValue());
        }
    }
}
