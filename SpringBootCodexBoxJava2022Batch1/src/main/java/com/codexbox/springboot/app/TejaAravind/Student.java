package com.codexbox.springboot.app.TejaAravind;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private Integer rollNo;
    private String name;
    private String address;
    private Integer marks;
    private String grade;
    private static final Integer totalMarks = 600;

    public void setStudentDetails(List<Student> list, int numOfStudents) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < numOfStudents;i++) {
            Student student = new Student();
            System.out.println("Enter the Student "+(i+1)+ " Details");
            System.out.println("Enter the Student Roll No : ");
            student.setRollNo(Integer.parseInt(inp.nextLine()));
            System.out.println("Enter the Student Name : ");
            student.setName(inp.nextLine());
            System.out.println("Enter the Student Address : ");
            student.setAddress(inp.nextLine());
            System.out.println("Enter the Student marks out of 600 : ");
            int marks = Integer.parseInt(inp.nextLine());
            student.setMarks(marks);
            student.calculateGrade(student.getMarks());
            list.add(student);
        }
		System.out.println("Before Sorting : ");
		for (Student student : list) {
			student.display();
		}
    }

    public void sortedList(List<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGrade().equalsIgnoreCase(o2.getGrade())) {
                    if (o2.getName().equalsIgnoreCase(o1.getName())) {
                        if (Objects.equals(o2.getMarks(), o1.getMarks())) {
                            return o1.getRollNo().compareTo(o2.getRollNo());
                        }
                        return o2.getMarks().compareTo(o1.getMarks());
                    }
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getGrade().compareTo(o2.getGrade());

            }
        });

		System.out.println("After Sorting");
		for (Student stud : list) {
			stud.display();
		}
    }

    public String calculateGrade(Integer marks){
        marks = (marks * 100) / totalMarks;
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
