package com.codexbox.springboot.app.mounika.duplicateelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 4, 4, 5};
        System.out.println("enter the duplicate elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
