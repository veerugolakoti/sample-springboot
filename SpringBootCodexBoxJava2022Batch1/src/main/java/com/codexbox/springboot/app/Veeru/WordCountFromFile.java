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

       // String s = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ipsum nibh, cursus sed nisl a, vestibulum aliquet augue. Proin quam libero, blandit vel varius non, fringilla id velit. Fusce ac est felis. Vestibulum quis lacinia velit. Nunc pulvinar ex urna, aliquam finibus felis pulvinar vel. Sed ultrices laoreet velit, id maximus massa rutrum malesuada. Cras viverra erat vel porttitor vestibulum. Fusce congue odio id vulputate consectetur. Morbi egestas urna non dignissim eleifend.");
       // String a[] = s.split(" ");
        Map<String, Integer> word = new HashMap<>();
        for (String str : words) {
            if (word.containsKey(str)) {
                word.put(str, 1 + word.get(str));
            } else {
                word.put(str, 1);
            }
        }
        System.out.println(word);
    }
}



