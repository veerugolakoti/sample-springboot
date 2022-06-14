package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ganesh.multithreading.ThreadExample;

public class GaneshMainClass {
    public static void main(String[] args) throws InterruptedException {

        ThreadExample example = new ThreadExample();

        example.start();
        System.out.println(example.getState());
        System.out.println(example.getId());
        System.out.println( example.getName());
        System.out.println(example.getState());

    }












}
