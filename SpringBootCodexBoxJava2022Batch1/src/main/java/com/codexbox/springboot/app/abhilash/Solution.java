package com.codexbox.springboot.app.abhilash;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list;
        ArrayList<ArrayList> list2 = new ArrayList<>();
        System.out.println("enter the size of rows:");
        int rows = sc.nextInt();


        for (int j = 0; j < rows; j++) {
            System.out.println("enter the size of list:");
            int n1 = sc.nextInt();
            list = new ArrayList<>();
            for (int i = 0; i < n1; i++) {
                System.out.println("enter the list " + (i + 1) + " value");
                list.add(sc.nextInt());
            }

//            for (int a: list) {
//                System.out.println(list.get());
//            }
            list2.add(list);
        }
        System.out.println("enter no.of checkings");
        int n2 = sc.nextInt();
        int arr[][] = new int[n2][2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("enter " + (j + 1) + " value:");
                arr[i][j] = sc.nextInt();
            }
            //    System.out.println(list2.get(a-1).get(b-1));
        }

        for (int s = 0; s < n2; s++) {
            try {
                System.out.println(list2.get(arr[s][0] - 1).get(arr[s][1] - 1));

            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
