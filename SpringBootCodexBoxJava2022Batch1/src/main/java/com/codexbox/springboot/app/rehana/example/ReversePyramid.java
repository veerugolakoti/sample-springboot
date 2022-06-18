package com.codexbox.springboot.app.rehana.example;

public class ReversePyramid {
    public static void main(String[] args) {
        for(int i =0;i<=10;i++){

            for(int j =0;j<=10-i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
