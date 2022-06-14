package com.codexbox.springboot.app.mounika;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {
   public String name;

   public String getName() {
      return name;
   }

   public int getId() {
      return id;
   }

   public String getAddress() {
      return address;
   }

   //public String getAbsent() {
      //return absent;
  // }

   public int id;
   public String address;
  // private String absent;

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
       System.out.println(".......................");

       System.out.println(name+" "+id +" "+ address);
    }

   }
