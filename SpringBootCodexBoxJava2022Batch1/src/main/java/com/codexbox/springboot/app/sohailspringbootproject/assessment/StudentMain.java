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
        for (Student studentslist : myStudentList) {
            System.out.println(studentslist.getName());
            System.out.println(studentslist.getId());
            System.out.println(studentslist.getMarks());
            System.out.println(studentslist.getGrade());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        Collections.sort(myStudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGrade()==o2.getGrade()){
                    if(o2.getMarks()==o1.getMarks()) {
                        if(o1.getName().equalsIgnoreCase(o2.getName())) {
                            return o1.getId().compareTo(o2.getId());
                        }
                        return  o1.getName().compareTo(o2.getName());
                    }
                    return o2.getMarks().compareTo(o1.getMarks());
                }
                return o1.getGrade().compareTo(o2.getGrade());
            }
        });


        System.out.println("After Sorting");
        for (Student sortedList : myStudentList) {
            System.out.println(sortedList.getName());
            System.out.println(sortedList.getId());
            System.out.println(sortedList.getMarks());
            System.out.println(sortedList.getGrade());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}




