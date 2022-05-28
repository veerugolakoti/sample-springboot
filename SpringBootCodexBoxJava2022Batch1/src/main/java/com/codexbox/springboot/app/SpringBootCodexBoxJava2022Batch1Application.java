package com.codexbox.springboot.app;

import com.codexbox.springboot.app.abhilash.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		Scanner sc = new Scanner (System.in);
		List<Employee> list = new LinkedList<>();
		Employee emp = new Employee();
		for(int i=1;i<=3;i++){
			System.out.println("Enter employee "+ i +" details:");
			System.out.println("enter employee id");
			Integer eid = sc.nextInt();
			System.out.println("enter employee name");
			String name = sc.next();
			System.out.println("enter the address ");
			String address = sc.next();
			Employee emp1 = new Employee(eid,name,address);
			list.add(emp1);
		}
		System.out.println(list);
		System.out.println("enter how many employees absent");
		Integer number = sc.nextInt();
		if(number>0) {
			System.out.println("enter name of employee/employees is/are absent");
			for (int i = 1; i <= number; i++) {
				String absent = sc.next();
				//System.out.println(list.indexOf(absent));
				 emp.setDetails();
				System.out.println("enter the index of a employee");
				Integer index = sc.nextInt();
				list.set(index,emp);
				break;
				}
			System.out.println(list);

			}

		}

	}

