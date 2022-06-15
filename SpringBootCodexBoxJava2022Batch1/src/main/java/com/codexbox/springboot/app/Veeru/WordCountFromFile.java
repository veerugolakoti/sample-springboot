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
       /* String[] words = null;
        String[] arr = null;
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                System.out.println("Got IOException while reading the content from file" + filePath);
                e.printStackTrace();
            }
            words = line.split(",");


        }
        findWordCount(words);
    }
*/
    private static void findWordCount(List<String> words) {
        // String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sollicitudin id enim ac aliquam. Ut molestie, ligula id porttitor eleifend, arcu erat fringilla libero, et sagittis justo magna eu tellus. Sed quis varius augue. Etiam suscipit bibendum bibendum. Donec placerat urna a egestas iaculis. Proin dictum commodo orci. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aliquam gravida, nisl at vehicula lobortis, purus quam dapibus leo, in lobortis urna urna ac ex. Donec mattis velit dolor, at bibendum enim elementum vitae. Duis magna arcu, ullamcorper volutpat odio id, fringilla condimentum risus.";



        Map<String, Integer> word = new TreeMap<>();
        //System.out.println("word " +word.get());
        for (String str : words) {
            if (word.containsKey(str)) {
                word.put(str, 1 + word.get(str));
            } else {
                word.put(str, 1);
            }
        }
        //System.out.println(word);
/*

        List<Map.Entry<String,Integer>> list=new ArrayList(word.entrySet());
        Collections.sort(list,new MyComparator());

        for (Map.Entry<String,Integer> entry:list) {

            System.out.println(entry.getKey() +" = "+entry.getValue());
        }
*/
        List<Map.Entry<String, Integer>> list = new ArrayList(word.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : list) {

            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
