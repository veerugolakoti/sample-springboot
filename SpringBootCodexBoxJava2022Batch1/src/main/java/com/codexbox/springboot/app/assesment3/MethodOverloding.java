package com.codexbox.springboot.app.assesment3;

public class MethodOverloding {
    static int add(int a, int b)
    {
        return a + b;
    }

    static int add(int a, int b, int c , int d)
    {
        return a + b + c + d;
    }

    public static void main(String args[])
    {
        /*System.out.println("add() with 2 parameters");*/
        System.out.println(add(4, 6));

        /*System.out.println("add() with 3 parameters");*/
        System.out.println(add(4, 6, 7 ,12));
    }
}
