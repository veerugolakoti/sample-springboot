package com.codexbox.springboot.app.ramdurgaprasad.assessment5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class LexicographicalOrder {
    public void dictionary(){
        InputStream inputStream = null;

        {
            try {

                FileReader fileReader = new FileReader("ram.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                try {
                    String words = bufferedReader.readLine();
                    words=words.toLowerCase(Locale.ROOT);
                    String[] splitword = words.split(" ");
                    List<String> list = new ArrayList<>();
                    list = Arrays.asList(splitword);
                    System.out.println(list);

                    Arrays.sort(splitword);
                    for (String word:list) {
                        System.out.println(word);
                    }
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }}

