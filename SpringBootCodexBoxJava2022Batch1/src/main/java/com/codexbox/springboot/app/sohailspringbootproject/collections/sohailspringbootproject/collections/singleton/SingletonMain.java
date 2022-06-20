package com.codexbox.springboot.app.sohailspringbootproject.collections.sohailspringbootproject.collections.singleton;

public class SingletonMain {
    public static void main(String[] args) {

        Singleton single = Singleton.getTest();
        Singleton single1 = Singleton.getTest();
        Singleton single2 = Singleton.getTest();
        Singleton single3 =  Singleton.getTest();
        System.out.println(single);
        System.out.println(single1);
        System.out.println(single2);
        System.out.println(single3);
    }
}
