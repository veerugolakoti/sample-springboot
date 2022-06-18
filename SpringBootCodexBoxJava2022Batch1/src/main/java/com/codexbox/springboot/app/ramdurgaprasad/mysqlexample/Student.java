package com.codexbox.springboot.app.ramdurgaprasad.mysqlexample;

public class Student {
    private int student;
    private String firstname;
    private String lastname;

    public void setStudent(int student) {
        this.student = student;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private  String address;
    private String city;


    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getStudent() {
        return student;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
