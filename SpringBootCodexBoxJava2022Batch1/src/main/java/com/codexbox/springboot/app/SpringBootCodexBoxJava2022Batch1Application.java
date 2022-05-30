package com.codexbox.springboot.app;

import com.codexbox.springboot.app.sohailspringbootproject.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i<=29;i++){
			System.out.println("Enter Employee Deatils" +i);
			System.out.println("Enter the Employee Name : ");
			String name = scanner.next();
			System.out.println("Enter the Emplloyee ID : ");
			Integer id= scanner.nextInt();
			System.out.println("Enter the Employee Address : ");
			String address = scanner.next();

			Employee employee = new Employee("Sohail",202238,"Hyderabad");
			list.add(employee);

		}
		System.out.println(list.size());
	}
}
