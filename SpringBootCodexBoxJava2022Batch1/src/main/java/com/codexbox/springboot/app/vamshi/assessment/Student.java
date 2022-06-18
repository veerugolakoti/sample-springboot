package com.codexbox.springboot.app.vamshi.assessment;

public class Student {
    private Integer rollno;
    private String name;
    private String address;
    private Integer marks;

    public Student(Integer no, String name, String address, Integer marks) {
        this.rollno = no;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public Integer getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getMarks() {
        return marks;
    }

    public String g(int g) {
        if (g >= 90) {
            return "G-1";
        } else if (g > 60) {
            return "G-2";
        } else if (g > 35) {
            return "G-3";
        } else if (g < 35) {
            return "fail";
        }
        return null;
    }
}


