package com.codexbox.springboot.app;

import com.codexbox.springboot.app.sohailspringbootproject.Employee;
import com.codexbox.springboot.app.sohailspringbootproject.collections.HashSetExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);*/

		/*List<Employee> list = new ArrayList<>();
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
		for (Employee emp : list) {
			System.out.println(emp.getName());
			System.out.println(emp.getId());
			System.out.println(emp.getAddress());
			System.out.println("+++++++++++++++++++");

		}
		for (int i = 1; i <= 1; i++) {
			System.out.println("Enter the Employee name to be removed : ");
			String empName = scanner.next();
			if (empName.equalsIgnoreCase(list.get(i).getName())) {
				st = list.remove(i);
			}
			System.out.println("The new Employee List : ");
			System.out.println();
		}

		System.out.println(list.size());*/

        HashSetExample hashSetExample = new HashSetExample();
        hashSetExample.hashSetMethod();
	}
}

