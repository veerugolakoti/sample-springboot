package com.codexbox.springboot.app.abhilash;

public class Diamond extends Thread{
    public void star() {
        for ( int i =0 ;i<5 ;i++) {
            for(int j =0 ;j<=i ;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
