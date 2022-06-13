package com.codexbox.springboot.app.codexbox.BhargavTej.constructorexamples;

public class NoArgumentedConstructor {
//    int num;
//    String str;
// NoArgumentedConstructor(){
//     System.out.println("Constructor Called");
     String name;
    int age;
    public void NoArgumentedConstructor(String name , int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
//     NoArgumentedConstructor noArgumentedConstructor = new NoArgumentedConstructor();
//        System.out.println(noArgumentedConstructor.num);
//        System.out.println(noArgumentedConstructor.str);

        NoArgumentedConstructor noArgumentedConstructor = new NoArgumentedConstructor();
        noArgumentedConstructor.NoArgumentedConstructor("Sai", 24);
    }
}