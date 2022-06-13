package com.codexbox.springboot.app.mounika.arrayaddingelements;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 7, 8};
        System.out.println("Array:" + Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(arr));
        arrayList.add(7);
        //arr = Collections.addAll(arrayList.arr);
        System.out.println("Array after adding element: " + Arrays.toString(arr));


        for (int i1 = 1; i1 <= 5; i1++) {
            for (int l = 1; l <= i1; l++) {
                System.out.println(" * ");
            }
            System.out.println();
        }
    }

}

