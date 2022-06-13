package com.codexbox.springboot.app.codexbox.BhargavTej.basics;

public class DuplicateValuesOfArray {


    public static void main(String[] args) {
        int [] arr ;
        arr = new int[]{1,2,3,4,4,5,6,6,7,7,9,9,8,10};
        for (int i=0; i< arr.length; i++){
            for (int j =i; j< arr.length-1; j++){
                if (arr[i]==(arr[j])&& (i!=j)){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
