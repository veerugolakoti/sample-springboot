package com.codexbox.springboot.app.ganesh.Scanner;

public class SingletonExample {
    private static  SingletonExample j = null;
     private SingletonExample(){
         System.out.println(" private constructor");
     }
    static{
        SingletonExample se = new SingletonExample();
    }
        public static SingletonExample dis(){

         return  j;
        }

}
