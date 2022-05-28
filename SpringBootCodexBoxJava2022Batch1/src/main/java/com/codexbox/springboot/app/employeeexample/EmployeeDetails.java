package com.codexbox.springboot.app.employeeexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {
   private String name;
   private int id;
   private String address;

   public void setName(String name) {
      this.name = name;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setAddress(String address) {
      this.address = address;
   }


    public void getDetails()
    {
       System.out.println("|||||||||||||||||||||||||||||||||||||||");

       System.out.println(name+" "+id +" "+ address);
    }

   }
