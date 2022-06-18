package com.codexbox.springboot.app.ravalispringboot.multithreadingprgm;

public class NumberExample extends Thread{
    Numbers n ;
    public NumberExample(Numbers n){
            this.n=n;
    }

    @Override
    public void run() {
        n.numbers(20);
    }
}
