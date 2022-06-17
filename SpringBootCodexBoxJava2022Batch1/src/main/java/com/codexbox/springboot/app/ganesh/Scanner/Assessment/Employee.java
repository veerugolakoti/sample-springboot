package com.codexbox.springboot.app.ganesh.Scanner.Assessment;

import java.util.*;
public class Employee {

   private int id ;
   private String name ;
   private String address;

    public Employee(int id,String name ,String address){

         this.id= id;
         this.name=name;
         this.address=address;
    }
public void display(){
    System.out.println("============Enter the Employee details=========");
    System.out.println("Enter the Employee id = " +  id);
    System.out.println("Enter the Employee name = " +  name);
    System.out.println("Enter the Employee address  = " +  address);
}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
