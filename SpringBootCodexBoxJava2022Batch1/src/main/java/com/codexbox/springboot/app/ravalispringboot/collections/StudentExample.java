package com.codexbox.springboot.app.ravalispringboot.collections;

public class StudentExample {
    String name;
    int id;
    String address;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public StudentExample(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;

    }

}
