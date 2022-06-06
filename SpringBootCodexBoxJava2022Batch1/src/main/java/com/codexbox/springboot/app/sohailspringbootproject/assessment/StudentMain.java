package com.codexbox.springboot.app.sohailspringbootproject.assessment;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total Number of  students for Sorting : ");
        int size = scanner.nextInt();
        List<Student> myStudentList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Student student = new Student();
            System.out.println("Enter the Student Name :");
            student.setName(scanner.next());
            System.out.println("Enter the Student ID : ");
            student.setId(scanner.nextInt());
            System.out.println("Enter the Student Marks out of 100 : ");
            student.setMarks(scanner.nextInt());
            System.out.println("The Student Grade is : ");
            System.out.println(student.getGrade());
            myStudentList.add(student);
        }

        System.out.println("Before Sorting");
        for (Student student1 : myStudentList) {
            System.out.println(student1.getName());
            System.out.println(student1.getId());
            System.out.println(student1.getGrade());
            System.out.println(student1.getMarks());
        }
        Collections.sort(myStudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade().compareTo(o2.getGrade());
            }
        });

        System.out.println("After Sorting");
        for (Student student1 : myStudentList) {
            System.out.println(student1.getName());
            System.out.println(student1.getId());
            System.out.println(student1.getGrade());
            System.out.println(student1.getMarks());
        }
    }
}




