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
        List<String[]> array = new ArrayList<>();
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            array.add(line.split(" "));

        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            for (String arr : array.get(i)) {
                arrayList.add(arr);
            }
        }
        findWordCount(arrayList);
    }
    private static void findWordCount(ArrayList<String> arrayList) {
        Map<String, Integer> word = new HashMap<>();
        for (String string : arrayList) {
            if (word.containsKey(string)) {
                word.put(string, word.get(string)+1);
            } else {
                word.put(string, 1);
            }

        }
        System.out.print(word);
       List<Map.Entry<String, Integer>> entryList = new LinkedList<>(word.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String,Integer> entrylist :entryList) {
            System.out.println(entrylist.getKey()+ " :"+ entrylist.getValue());

        }


    }
}



