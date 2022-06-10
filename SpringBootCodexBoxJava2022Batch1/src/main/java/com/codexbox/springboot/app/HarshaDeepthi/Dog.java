package com.codexbox.springboot.app.HarshaDeepthi;

import com.codexbox.springboot.app.HarshaDeepthi.Methodoverriding.Animal;

public class Dog extends Animal {
  public char eat(){
        System.out.println("derived class");
        System.out.println("dog is eating");


      return 0;
  }
}
