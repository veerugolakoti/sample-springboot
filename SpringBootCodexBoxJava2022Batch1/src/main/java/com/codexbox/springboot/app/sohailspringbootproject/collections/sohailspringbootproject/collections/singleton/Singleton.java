package com.codexbox.springboot.app.sohailspringbootproject.collections.sohailspringbootproject.collections.singleton;

public class Singleton {
    private static Singleton test=null;
     Singleton(){
        System.out.println("This is a SIngleton Example ");
    }
    public static Singleton getTest(){
        if(test==null){
            test= new Singleton();
        }
        return test;
    }
}
