package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentence :");
        String letter = scanner.next();
      if(letter.equalsIgnoreCase("a")||letter.equalsIgnoreCase("e")||letter.equalsIgnoreCase("i")||letter.equalsIgnoreCase("o")||letter.equalsIgnoreCase("u")) {
          System.out.println("Vowel");
      }
          else{
              System.out.println("Consonant");
          }
          }
      }





