package com.codexbox.springboot.app.ramdurgaprasad.assessment5;

public class StarPattern{
    public static void main(String[] args){
        int n =5;
        for (int i=1;i<=n;i++){
            for (int j = 1; j <=n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 0; i < 3*n; i++) {
            int total=i>n?3*n-i:i;
            for (int j = 0; j < total; j++) {
                System.out.print(" * ");
            }
            System.out.println();        }
        for (int i = 0; i < 2*n; i++) {
            int total=i>n?2*n-i:i;
            int space =n-total;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < total; k++) {
                System.out.print(i+" ");

            }
            System.out.println();

        }
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                int evryindex =Math.max(Math.max(n-i,n-j),Math.multiplyExact(i, j));
                System.out.print(evryindex+ " ");

            }
            System.out.println();

        }

    }





}


