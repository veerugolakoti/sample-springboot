package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ganesh.Scanner.Assessment.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());

         int count =1;
		List<Employee> list = new LinkedList<>();
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
			System.out.println("========Enter the employee "+ i +" details=========");
			System.out.println("Enter the Employee id");
             Integer id =Integer.parseInt(s.nextLine());
			System.out.println("Enter the Employee name");
			String name = s.nextLine();
			System.out.println("Enter the Employee address");
			String address = s.nextLine();
            Employee emp = new Employee(id,name,address);
             list.add(emp);
		}
		for (Employee  e:list) {

			e.display();
		}
		System.out.println("========Remove person=========");

	}
}