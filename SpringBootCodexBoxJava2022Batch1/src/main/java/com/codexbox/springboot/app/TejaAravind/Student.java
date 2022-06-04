package com.codexbox.springboot.app.TejaAravind;

public class Student {
    private Integer rollNo;
    private String name;
    private String address;
    private Integer marks;
    private String grade;

    public String calulateGrade(Integer marks){
        if(marks >= 90){
            this.grade =  "G1";
            return "G1";
        }
        if(marks > 60){
            this.grade = "G2";
            return "G2";
        }
        if(marks >= 35){
            this.grade =  "G3";
            return "G3";
        }
        this.grade =  "G4";
        return "G4";

    }
    public void display(){
        System.out.println("Student " + this.name + " details ");
        System.out.println("Student Roll No : " + this.rollNo);
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Address : " + this.address);
        System.out.println("Student Marks : " + this.marks);
        System.out.println("Student Grade : " + this.grade);
        System.out.println();
    }

    public String getGrade() {
        return grade;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}
