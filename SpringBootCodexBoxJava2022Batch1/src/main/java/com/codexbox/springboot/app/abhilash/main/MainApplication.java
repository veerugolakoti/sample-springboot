package com.codexbox.springboot.app.abhilash.main;

import com.codexbox.springboot.app.LinkedListExample;
import com.codexbox.springboot.app.Veeru.Collections.StudentGradeAssessment;
import com.codexbox.springboot.app.abhilash.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application.class, args);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new LinkedList<>();

		int count = 1;
		List<Employee> empList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			Employee emp = new Employee();
			System.out.println("Enter employee " + (i+1) + " details:");
			emp.setDetails();
			list.add(emp);
		}
		for (Employee e : list) {
			e.showDetails();
		}
		System.out.println("enter how many employees absent");
		Integer number = sc.nextInt();
		if (number > 0) {
			System.out.println("enter name of employee/employees is/are absent");
			for (int i = 0; i < list.size(); i++) {
				Employee employee = new Employee();
				String absent = sc.next();
				if (list.get(i).getEmployee_name().equalsIgnoreCase(absent)) {
					System.out.println("enter new employee details:");
					employee.setDetails();
					System.out.println("index of old employee is");
					Integer index = list.indexOf(list.get(i).getEmployee_name());
					System.out.println(index);
					list.set(i, employee);
				}
				break;
			}
				for (Employee e : list) {
					e.showDetails();
				}

			}
        System.out.println("My total employees : " + empList.size());
    }

    }



