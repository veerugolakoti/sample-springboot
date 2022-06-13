package com.codexbox.springboot.app.mounika.hashmap;

import org.springframework.boot.env.ConfigTreePropertySource;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
        public static void main(String[] args) {
            HashMap<String, Integer> numbers = new HashMap<>();
            numbers.put("One", 1);
            numbers.put("Two", 2);
            numbers.put("Three", 3);
            System.out.println("HashMap: " + numbers);
            Integer value=2;

            for(Map.Entry<String, Integer> entry: numbers.entrySet()) {
                if(entry.getValue() == value) {
                    System.out.println("The key for value " + value + " is " + entry.getKey());

                }
            }




        }
    }


