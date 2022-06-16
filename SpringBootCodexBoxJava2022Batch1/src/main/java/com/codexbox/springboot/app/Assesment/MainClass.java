package com.codexbox.springboot.app.Assesment;

import java.util.*;
import java.util.concurrent.Callable;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> listofstudents = new ArrayList<>();
        for (int i = 1;i<=3;i++){
            System.out.println("enter the student details");
            System.out.println("student id");
            int id = sc.nextInt();
            System.out.println("student name");
            String name = sc.next();
            System.out.println("student address");
            String address = sc.next();
            System.out.println("student marks");
            int marks = sc.nextInt();
            Student student = new Student(id,name,address,marks);
            student.calculate();
            listofstudents.add(student);
        }
        for (Student data:listofstudents) {
            data.display();
        }
        Collections.sort(listofstudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {


                if (o1.getGrade().equalsIgnoreCase(o2.getGrade())){
                    if(o1.getStudentname().equalsIgnoreCase(o2.getStudentname())){
                        if (o1.getStudentmarks() == o2.getStudentmarks()){

                            return o1.getStudentid().compareTo(o2.getStudentid());

                        }
                        return o2.getStudentmarks().compareTo(o1.getStudentmarks());

                    }
                    return o1.getStudentname().compareTo(o2.getStudentname());

                }
                return o1.getGrade().compareTo(o2.getGrade());
            }
        });
                System.out.println("After sorting");
        for (Student data:listofstudents) {
            data.display();
        }
}
}



