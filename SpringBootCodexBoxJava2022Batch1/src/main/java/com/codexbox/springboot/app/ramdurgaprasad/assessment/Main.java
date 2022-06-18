package com.codexbox.springboot.app.ramdurgaprasad.assessment;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Students> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of students");
        int numberofstudents = scanner.nextInt();
        for (int i = 1; i <= numberofstudents; i++) {
            Students students = new Students();
            System.out.println("enter the rollno of the" + i + " student:");
            students.setRollno(scanner.next());
            System.out.println("enter the name of the" + i + "student:");
            students.setName(scanner.next());
            System.out.println("enter the address of the " + i + "students:");
            students.setAddress(scanner.next());
            System.out.println("enter the marks of the " + i + "student out of 100");
            students.setMarks(scanner.nextInt());
            list.add(students);

        }
        System.out.println("the student details before sorting");
        int count = 1;
        for (Students student : list) {
            System.out.println("_________details of" + count++ + "student___________");
            student.displaydetails();
            student.grades();
        }
        Map<Students, String> map = new HashMap<>();
        for (Students stu : list) {
        map.put(stu,stu.getGrade());
        }
        for (Map.Entry<Students,String> order: map.entrySet()) {
            System.out.println("student id no :"+order.getKey().getRollno()+": with grade:"+ order.getValue());

        }


    }}