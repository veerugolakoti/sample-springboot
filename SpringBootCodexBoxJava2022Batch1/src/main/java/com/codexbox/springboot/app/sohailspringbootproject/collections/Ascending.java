package com.codexbox.springboot.app.sohailspringbootproject.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

    int [] arr= new int [5];

    public void ascendingMethod() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Array Values ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            for (int x = 0; x < arr.length; x++) {
                if (arr[x] >= arr[x + 1]) {
                    System.out.println(arr[x]);
                    x++;
                }
                j++;
            }
        }
    }

}
