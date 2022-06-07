package com.codexbox.springboot.app.vamshi.assessment;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentsList {
    public void  calculate(){
        List<Student> listofstudents = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int total = 100;


        for (int i = 1; i<= 2; i++) {
            System.out.print("Enter student-"+i+" Details");
            System.out.print("enter your roll no -");
            Integer rollno = scanner.nextInt();
            System.out.print("enter student name -");
            String name = scanner.next();
            System.out.print("enter student address -");
            String address = scanner.next();
            System.out.print("enter student marks -");
            Integer marks = scanner.nextInt();
            listofstudents.add(new Student(rollno,name,address,marks));
        }
        System.out.println(listofstudents);
        System.out.print("enter student marks");
        Integer marks = scanner.nextInt();
        double percentage= total*marks/100;
        System.out.println(percentage);

    }
}
