package com.codexbox.springboot.app.swathi.assesment.collections;

public class Student {
    String name;
    Integer Id;
    String address;
   public Student(String name,Integer Id ,String address){
        this.name= name;
        this.Id=Id;
        this.address=address;
   }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return Id;
    }

    public String getAddress() {
        return address;
    }
}
