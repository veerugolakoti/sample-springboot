package com.codexbox.springboot.app.assesment4;

import com.codexbox.springboot.app.rehana.filehandling.BufferedWriterExample;
import com.codexbox.springboot.app.rehana.filehandling.BufferedoutputStreamExample;
import com.codexbox.springboot.app.rehana.filehandling.FileReaderExample;
import com.codexbox.springboot.app.rehana.multithreading.MyThread;
import com.codexbox.springboot.app.rehana.multithreading.MyThread2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
       /*MyThread myThread= new MyThread();
       myThread.start();*/
        MyThread2 myThread2 = new MyThread2();
        System.out.println(myThread2.getState());
        myThread2.start();
        myThread2.getState();
       // System.out.println(Thread.activeCount());

        try {
            myThread2.join();
            System.out.println("iam joining my thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getState());
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      //  System.out.println(Thread.currentThread().getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(myThread2.getState());




       /* BufferedWriterExample bufferedWriterExample = new BufferedWriterExample();
        bufferedWriterExample.write();
*/
       /* FileReaderExample fileReaderExample = new FileReaderExample();
        fileReaderExample.reader();*/
    }
    }

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


       /* FileInputoutputExample fileInputoutputExample = new FileInputoutputExample();
        try {
            fileInputoutputExample.fileoperations();
        } catch (IOException e) {
            throw new RuntimeException(e);*/

//BUFFEREXAMPLE

       /* BufferedoutputStreamExample bufferedoutputStreamExample = new BufferedoutputStreamExample();
        try {
            bufferedoutputStreamExample.operations();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // SequenceInputStream Example
       /* SequenceIpStreamEx sequenceIpStreamEx = new SequenceIpStreamEx();
        try {
            sequenceIpStreamEx.sequence();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
  //  }
        //FileReaderExample




















