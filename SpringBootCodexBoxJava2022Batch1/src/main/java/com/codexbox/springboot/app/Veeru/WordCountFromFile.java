package com.codexbox.springboot.app.Veeru;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

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
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sollicitudin id enim ac aliquam. Ut molestie, ligula id porttitor eleifend, arcu erat fringilla libero, et sagittis justo magna eu tellus. Sed quis varius augue. Etiam suscipit bibendum bibendum. Donec placerat urna a egestas iaculis. Proin dictum commodo orci. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aliquam gravida, nisl at vehicula lobortis, purus quam dapibus leo, in lobortis urna urna ac ex. Donec mattis velit dolor, at bibendum enim elementum vitae. Duis magna arcu, ullamcorper volutpat odio id, fringilla condimentum risus.";
        String a[] = s.split(" ");
        Map<String, Integer> word = new HashMap<>();
        for (String str : a) {
            if (word.containsKey(str)) {
                word.put(str, 1 + word.get(str));
            } else {
                word.put(str, 1);
            }
        }
        System.out.println(word);
    }
    }
