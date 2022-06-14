package com.codexbox.springboot.app.abhilash.main;

import com.codexbox.springboot.app.LinkedListExample;
import com.codexbox.springboot.app.Veeru.Collections.StudentGradeAssessment;
import com.codexbox.springboot.app.abhilash.Diamond;
import com.codexbox.springboot.app.abhilash.Employee;
import com.codexbox.springboot.app.abhilash.filehandling.FileHandlingExample;
import com.codexbox.springboot.app.abhilash.multithreading.MultithreadingExample2;
import com.codexbox.springboot.app.abhilash.multithreading.MultitreadingExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.plaf.multi.MultiInternalFrameUI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) throws IOException {

		SpringApplication.run(com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application.class, args);
//        Scanner sc = new Scanner(System.in);
//        List<Employee> list = new LinkedList<>();
//
//		int count = 1;
//		List<Employee> empList = new ArrayList<>();
//		Scanner scanner = new Scanner(System.in);
//
//		for (int i = 0; i < 2; i++) {
//			Employee emp = new Employee();
//			System.out.println("Enter employee " + (i+1) + " details:");
//			emp.setDetails();
//			list.add(emp);
//		}
//		for (Employee e : list) {
//			e.showDetails();
//		}
//		System.out.println("enter how many employees absent");
//		Integer number = sc.nextInt();
//		if (number > 0) {
//			System.out.println("enter name of employee/employees is/are absent");
//			for (int i = 0; i < list.size(); i++) {
//				Employee employee = new Employee();
//				String absent = sc.next();
//				if (list.get(i).getEmployee_name().equalsIgnoreCase(absent)) {
//					System.out.println("enter new employee details:");
//					employee.setDetails();
//					System.out.println("index of old employee is");
//					Integer index = list.indexOf(list.get(i).getEmployee_name());
//					System.out.println(index);
//					list.set(i, employee);
//				}
//				break;
//			}
//				for (Employee e : list) {
//					e.showDetails();
//				}
//
//			}
//        System.out.println("My total employees : " + empList.size());
//    }
//		for(int i = 0 ;i<6 ;i++) {
//			MultitreadingExample ex = new MultitreadingExample();
//			System.out.println(ex.getId());
//			System.out.println(ex.getName());
//		}
//		Thread th = new Thread();
//		System.out.println(th.getId());
//		System.out.println(th.getName());
//		Thread th1 = new Thread();
//		System.out.println(th1.getId());
//		System.out.println(th1.getName());
//		Thread th2 = new MultitreadingExample();
//		System.out.println(th2.getId());
//		System.out.println(th2.getName());
//		Thread t = new Thread();
//		t.start();
//		System.out.println(t.getState());
//		try {
//			t.sleep(1000l);
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}
//		System.out.println("started");

		MultitreadingExample mi1 = new MultitreadingExample();
		mi1.mythread();
		System.out.println(mi1.getId());
		System.out.println(mi1.getName());
		MultithreadingExample2 mi =new MultithreadingExample2();
		System.out.println("multithreading example2");
		mi.start();
		System.out.println(mi.getState());
		mi1.setPriority(3);
		mi.setPriority(10);
		Diamond d = new Diamond();
		d.start();
		d.star();
		d.setPriority(1);
		System.out.println(d.getState());
		System.out.println(mi.getState());


	}
    }



