package com.codexbox.springboot.app.sohailspringbootproject.constructor;

public class main {
    public static void main(String[] args) {
        Test test = new Test(25);
        System.out.println(test.getSum());
        test.setSum(56);
    }
}
