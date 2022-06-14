package com.codexbox.springboot.app.codexbox.BhargavTej.mainpackage;
import com.codexbox.springboot.app.codexbox.BhargavTej.assesment3.CodexBoxEmployee;
import com.codexbox.springboot.app.codexbox.BhargavTej.filehandling.InputOutputStream;
import com.codexbox.springboot.app.codexbox.BhargavTej.filehandling.InputOutputStreamExample2;
import com.codexbox.springboot.app.codexbox.BhargavTej.filehandling.SequenceStreams;
import com.codexbox.springboot.app.codexbox.BhargavTej.mutlithreading.MultiThreadExamples;
import com.codexbox.springboot.app.codexbox.BhargavTej.mutlithreading.MultiThreadExamples2;
import org.springframework.boot.SpringApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpringBootCodexBoxJava2022Batch1Application {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application.class, args);
//        SequenceStreams sequenceStreams = new SequenceStreams();
//        System.out.println(sequenceStreams.sequenceMethod());

        //Main method of MultiThreadExamples2
        MultiThreadExamples2 multithread = new MultiThreadExamples2();
        System.out.println("calling start method");
        multithread.start();
//        multithread.run();
//        System.out.println("calling run method");
        System.out.println(multithread.getState());
        Thread.sleep(3600l);
        System.out.println("i am awake after 3.6sec");
        multithread.wait();
        multithread.notify();
        System.out.println("i am still  waiting");




        //Main method of MultiThreadExamples
//        MultiThreadExamples multiThreadExamples = new MultiThreadExamples();
//        System.out.println("Before using run method");
//        multiThreadExamples.start();
////        multiThreadExamples.mythread();
//        System.out.println(multiThreadExamples.getState());
//        System.out.println("After using run method");
//
////        multiThreadExamples.start();
////        multiThreadExamples.mythread();
////        multiThreadExamples.run();
//        Thread.sleep(5000);
//        System.out.println("im awake");
//        System.out.println(multiThreadExamples.getName());
//        System.out.println(multiThreadExamples.getState());



        //CodexBoxEmployee mian method
//       List<CodexBoxEmployee> addEmpdetails = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        for (int i=1; i<3 ;i++){
//            System.out.println("Enter Employee" + i + " Details");
//            System.out.println("Enter Employee " + i + " name");
//            String name = scanner.nextLine();
//            System.out.println("Enter Employee" + i +  " Id");
//            Integer id = Integer.parseInt(scanner.nextLine());
//            System.out.println("Enter Employee"  +i + " Address");
//            String address = scanner.nextLine();
//
//            CodexBoxEmployee codexBoxEmployee = new CodexBoxEmployee(name,id, address);
//            addEmpdetails.add(codexBoxEmployee);
//        }
//        for (CodexBoxEmployee cx:addEmpdetails) {
//            cx.display();
//        }
//        System.out.print("Enter the id you want to remove: ");
//        int num = scanner.nextInt();
//        try
//        {
//            for (int i = 0; i < addEmpdetails.size(); i++) {
//                if (num == addEmpdetails.get(i).getEmployeeId()){
//                    addEmpdetails.remove(num);
//                }
//
//
//
//            }
//        }
//        catch(IndexOutOfBoundsException e){
//            System.out.println("enter right number to remove:"+ e);
//            System.out.print("Enter the id you want to remove: ");
//            num = scanner.nextInt();
//        }
//
//        for (CodexBoxEmployee cx:addEmpdetails) {
//            cx.display();
//        }
//
//        System.out.println("My total employee: " + addEmpdetails.size());
//
//
//
//
//       //InputStream Example
//        InputOutputStream inputOutputStream = new InputOutputStream();
//        inputOutputStream.fileInputOutputStream();
//
//
//        //InputStream Example 2
//        InputOutputStreamExample2 inputOutputStreamExample2 = new InputOutputStreamExample2();
//        try {
//            inputOutputStreamExample2.transferFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    }
}