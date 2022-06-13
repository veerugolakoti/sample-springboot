package com.codexbox.springboot.main;

import com.codexbox.springboot.threading.Multithreading;

public class Main {
    public static void main(String[] args) {
              int n = 8;
        for(int i=0;i<n;i++){
            Multithreading multithreading = new Multithreading();
            try {
                System.out.println(multithreading.isAlive());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }}}
