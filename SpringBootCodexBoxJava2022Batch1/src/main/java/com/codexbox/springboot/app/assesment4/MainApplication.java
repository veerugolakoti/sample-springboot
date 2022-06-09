package com.codexbox.springboot.app.assesment4;

import com.codexbox.springboot.app.rehana.files.BufferedoutputStreamExample;
import com.codexbox.springboot.app.rehana.files.FileInputoutputExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
       /*Scanner sc = new Scanner(System.in);
        System.out.println("enter number of students: ");
        int numberofstudents = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < numberofstudents; i++) {

            Student student = new Student();
            System.out.println("enter student id: ");
            student.setStudentid(sc.nextInt());
            System.out.println("enter student name: ");
            student.setStudentname(sc.next());
            System.out.println("enter student address:");
            student.setStudentaddress(sc.next());
            System.out.println("enter student marks: ");
            student.setStudentmarks(sc.nextInt());
            list.add(student);


        }
        int count = 1;
        System.out.println("before sorting  student details:");
        for (Student s : list) {
            s.getGrade();
            System.out.println("details of student " + count++);
            s.details();
            s.caluclate();
            ;
        }
        Student.sortedlist(list);*/
        /*System.out.println();
        Map<String, Student> map = new HashMap<>();
        System.out.println("before sorting student details");
        for (Student std : list) {
            std.details();*/


        FileInputoutputExample fileInputoutputExample = new FileInputoutputExample();
        try {
            fileInputoutputExample.fileoperations();
        } catch (IOException e) {
            throw new RuntimeException(e);

//BUFFEREXAMPLE
        /*BufferedoutputStreamExample bufferedoutputStreamExample = new BufferedoutputStreamExample();
        try {
            bufferedoutputStreamExample.operations();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        }
    }
}




