package com.codexbox.springboot.app.abhilash.assessment4;

public class Student {
    private Integer s_no;
    private String name;
    private String address;
    private Float marks;
    public Student(Integer s_no, String name, String address, Float marks) {
        this.s_no = s_no;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public Student()
    {
    }

    public Integer getS_no() {
        return s_no;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Float getMarks() {
        return marks;
    }

}
