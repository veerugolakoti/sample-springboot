package com.codexbox.springboot.app.TejaAravind.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
public class Student {

   public Student student;
    @Autowired
    public Student(Student student) {
//        this.student = student;
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }

    @Value("${student.rollNo}") private int rollNo;
        @Value("${student.name}") private String name;
        @Value("${student.age}") private  int age;

    public Student getRollNo() {
        return student;
    }


    // Method
        public void display()
        {
            // Printing attributes corresponding to student
            System.out.println("Roll No: " + student.rollNo);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
        }
    }


