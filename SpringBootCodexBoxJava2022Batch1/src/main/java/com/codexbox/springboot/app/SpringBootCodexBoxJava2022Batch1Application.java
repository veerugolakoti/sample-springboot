package com.codexbox.springboot.app;

import com.codexbox.springboot.app.sohailspringbootproject.Employee;
import com.codexbox.springboot.app.sohailspringbootproject.collections.Ascending;
import com.codexbox.springboot.app.sohailspringbootproject.collections.HashSetExample;
import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);*/

	/*	List<Employee> list = new ArrayList<>();
		Employee st;
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter Employee Deatils" + i);
			System.out.println("Enter the Employee Name : ");
			String name = scanner.next();
			System.out.println("Enter the Employee ID : ");
			Integer id = scanner.nextInt();
			System.out.println("Enter the Employee Address : ");
			String address = scanner.next();

			Employee employee = new Employee(name, id, address);
			list.add(employee);
		}

		System.out.println(list.size());


			System.out.println("Enter the Employee name to be removed : ");
			int empName = scanner.nextInt();
				list.remove(empName);



	System.out.println("The new Employee List : ");
	System.out.println(list);
		for (Employee emp : list) {
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getAddress());
		System.out.println("+++++++++++++++++++");
		}

		System.out.println(list.size());
*/
      /*  HashSetExample hashSetExample = new HashSetExample();
        hashSetExample.hashSetMethod();*/

		Ascending ascending = new Ascending();
		ascending.ascendingMethod();

	}


}

