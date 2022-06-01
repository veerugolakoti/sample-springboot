package com.codexbox.springboot.app.rehana.employedetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Employee {
    private String name;
    private int id;
    private String address;
   public Employee(String name,int id,String address){
     this.name =name;
     this.id =id;
     this.address = address;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}

