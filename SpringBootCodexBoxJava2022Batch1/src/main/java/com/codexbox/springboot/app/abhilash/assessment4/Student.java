package com.codexbox.springboot.app.abhilash.assessment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private Integer s_no;
    private String name;
    private String address;
    private Integer marks;
    private String grade;


    public Student(Integer s_no, String name, String address, Integer marks) {
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

    public void setS_no(Integer s_no) {
        this.s_no = s_no;
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

    public String getGrade() {
          return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void studentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        this.s_no = sc.nextInt();
        System.out.println("Enter student name: ");
        this.name = sc.next();
        System.out.println("Enter Student Address: ");
        this.address = sc.next();
        System.out.println("Enter Student marks");
        this.marks = sc.nextInt();
    }
    public String gradeCalculation(Integer marks) {
        marks = (marks/600)*100;
        if (marks >= 90) {
            this.grade= "g1";
            return "Grade g1";
        } else if (marks > 60 && marks < 90) {
            this.grade = "g2";
            return "Grade g2";
        } else if (marks > 35 && marks <= 60) {
            return "Grade g3";
        }else {
            return "Grade g4";
        }
    }
    public void getAllstudentDetails() {
        System.out.println("["+ "Student Id = " + getS_no() + "," +
                "name = " + getName() +","+
                "Address = " +getAddress() +","+
                "marks = " + getMarks() + "]" );
    }


}
