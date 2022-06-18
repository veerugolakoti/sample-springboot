package com.codexbox.springboot.app.ravalispringboot.multithreadingprgm;

public class NumberExample1 extends Thread{
    Numbers n;
    public NumberExample1(Numbers n){
        this.n = n;

    }

    @Override
    public void run() {
        n.numbers(10);
    }
}
