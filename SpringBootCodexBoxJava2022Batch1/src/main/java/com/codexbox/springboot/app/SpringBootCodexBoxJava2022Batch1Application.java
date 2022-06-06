package com.codexbox.springboot.app;

import com.codexbox.springboot.app.abhilash.Employee;
import com.codexbox.springboot.app.abhilash.assessment4.Student;
import com.codexbox.springboot.app.abhilash.assessment4.StudentDetails;
import com.codexbox.springboot.app.abhilash.enumaration.EnumarationExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		//LinkedListExample example = new LinkedListExample();
		//System.out.println(example.loadMyList());
//		Scanner sc = new Scanner(System.in);
//		List<Employee> list = new LinkedList<>();
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

		System.out.println(EnumarationExample.SUMMER.getValues());
		System.out.println(EnumarationExample.SPRING.name());
		System.out.println(EnumarationExample.FALL.ordinal());

		List<Student> list = new ArrayList<>();
		Student student = new StudentDetails();
		StudentDetails studentDetails1 = new StudentDetails();
		//for(int i = 0; i<2 ;i++) {
			//System.out.println("Enter student " + (i+1) + " details");
			studentDetails1.studentDetails();
		for ( Student s:list) {
			s.getAllstudentDetails();
		}
			}


		}
		//studentDetails1.getAllstudentDetails();



