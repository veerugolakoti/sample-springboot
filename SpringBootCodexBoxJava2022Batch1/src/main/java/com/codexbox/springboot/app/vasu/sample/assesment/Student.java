package com.codexbox.springboot.app.vasu.sample.assesment;

public class Student {
    Integer id;
    String name;
    Integer marks;
    String address;
    Float percentage;
    Character grade;



    public Student(int id, String name, int marks, String address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.address = address;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getAddress() {
        return address;
    }
    public Character getGrade() {
        return grade;
    }


    public Character gradeCalculation() {
        int totalmarks = 600;
        float percentage=(marks*100)/totalmarks;
        if (percentage > 85) {
            this.grade = 'A';
        } else if (percentage>=60 && percentage >= 80) {
            this.grade='B';
        } else if (percentage>=35 && percentage>= 60) {
            this.grade='C';
        } else  {
            this.grade='D';
        }
        return grade;
    }
    public void displayDetails(){
        System.out.println("Student Id:" + id);
        System.out.println("Student Name:"+name);
        System.out.println("Student Marks:"+marks);
        System.out.println("Student Address:" +address);
    }
}
