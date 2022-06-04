package com.codexbox.springboot.app.TejaAravind;

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
        ArrayList<String> arr = new ArrayList<>();
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            // arr.add( line.split(" "));
           arr.addAll(Arrays.asList(line.split(" ")));
        }
//        ArrayList<String> nums = new ArrayList<>();
//        for (int i = 0; i < arr.size(); i++) {
//            for (String str: arr.get(i)) {
//                nums.add(str);
//            }
//        }
        findWordCount(arr);
    }
    private static void findWordCount(ArrayList<String> nums) {
        Map<String, Integer> map = new TreeMap<>();
        for (String str : nums) {
            if (!map.containsKey(str)) {
                map.put(str, 0);
            }
            map.put(str, map.get(str) + 1);
        }
//        System.out.println(map.entrySet());
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,new MyComparator());
       /* new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        }*/

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(list);


    }







//        ArrayList<String> list = new ArrayList<>();
//        TreeMap<Integer, String> map = new TreeMap<>();
//
//        for (int i = 0; i < words.length; i++) {
//            int count = Collections.frequency(words, words[i]);
//            map.put(count, words);
//        }
//        for (Map.Entry<Integer,String> entry:map.entrySet() ) {
//            System.out.println(entry.getKey()+" : " +entry.getValue());
//
//        }












    }

