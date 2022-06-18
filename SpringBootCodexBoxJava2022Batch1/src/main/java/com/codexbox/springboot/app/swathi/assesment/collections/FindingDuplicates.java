package com.codexbox.springboot.app.swathi.assesment.collections;


import java.util.HashSet;
import java.util.Set;

public class FindingDuplicates {

   public static void main(String[] args) {
       String[] names = {"swathi", "renuka", "jhansi", "renuka"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] == names[j]) {

                }
            }
        }
        System.out.println("find the duplicate element from array using Hashset");
       Set<String>variables =new HashSet<>();
        for (String Variable:names) {
            if(variables.add(Variable)==false){
                System.out.println(Variable);
        }
    }
}}