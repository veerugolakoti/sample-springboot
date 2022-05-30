package com.codexbox.springboot.app.vamshi.collections;

import java.util.Stack;

public class StackExample {
    // public static void main(String[] args) {


    public void stackOperation() {
        Stack<String> car = new Stack();
        car.push("jeep");
        car.push("masirati");
        car.push("lambo");
        car.push("alfaromeio");
        car.push("doodge");
        car.push("nissan");
        car.push("ford");
        //car.pop();
        //car.peek();
        car.search("lambo");
        //car.empty();
        System.out.println(car);

    }

}









