package com.codexbox.springboot.app.vasu.sample.assesment;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        List<Employee> empList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 29 ; i++) {

            System.out.println("Enter Employee" + i + " Details: ");
            System.out.println("Enter emp name: ");
            String name = scanner.next();
            System.out.println("Enter emp id: ");
            Integer id = scanner.nextInt();
            System.out.println("Enter emp address: ");
            String address = scanner.next();

            Employee employee = new Employee(name, id, address);
            empList.add(employee);
        }
        System.out.println("My total employees : " + empList.size());

    }


       /* List<Student> mylist = new LinkedList<>();
        Scanner obj = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter student " + i + "Details");
            System.out.println("Enter Student Id: ");
            int id = obj.nextInt();
            System.out.println("Enter Student Name: ");
            String name = obj.next();
            System.out.println("Enter Student Marks: ");
            int marks = obj.nextInt();
            System.out.println("Enter Student Address: ");
            String address = obj.next();

            Student student = new Student(id, name, marks, address);
            mylist.add(student);
          student.gradeCalculation();

        }
        System.out.println("Before sorting student details: ");
        for (Student s:mylist) {
            s.displayDetails();
        }
        Collections.sort(mylist, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGrade().equals(o2.getGrade())){
                    if(o2.getName().equalsIgnoreCase(o1.getName())) {
                        if (o1.getMarks() == o2.getMarks()) {
                            return o2.getId().compareTo(o1.getId());
                        }
                            return o1.getName().compareTo(o2.getName());
                    }
                    return o1.getMarks().compareTo(o2.getMarks());
                }
                return o1.getGrade().compareTo(o2.getGrade());

                }
        });
        System.out.println("After sorting student Details");
       Map<Student, Character> studentsGradeMap = new HashMap<>();
        for (Student s1:mylist) {
            studentsGradeMap.put(s1,s1.getGrade());
        }
        for (Map.Entry<Student,Character> vs :studentsGradeMap.entrySet()) {
            System.out.println("Student:" +vs.getKey().id + " & grade:" +vs.getValue());
        }
*/
       }










