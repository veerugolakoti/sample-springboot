package com.codexbox.springboot.app;
import assessment3.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);

		List<Employee> list = new ArrayList<>();
		for (int i = 1; i < 2; i++) {
			Employee employee = new Employee();
			System.out.println(">>>>Employee " + i + " details<<<<");
			employee.Details();
			list.add(employee);
		}
		for (Employee e : list) {
			e.Details();
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Absent Name : ");
		String str = sc.next();
		Employee emp = new Employee();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equalsIgnoreCase(str)) {
				System.out.println(">>>>New employee details<<<<");
				emp.Details();
				list.set(i, emp);
				break;
			}
		}
			for (Employee em : list) {
				em.Details();
			}
		}
	}

