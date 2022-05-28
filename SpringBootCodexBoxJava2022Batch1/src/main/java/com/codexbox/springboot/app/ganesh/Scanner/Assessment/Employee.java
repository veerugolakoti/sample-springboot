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
    System.out.println("Enter the Employee id 1= " +  id);
    System.out.println("Enter the Employee name 1= " +  name);
    System.out.println("Enter the Employee address 1 = " +  address);
}
}
