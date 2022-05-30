package com.codexbox.springboot.app;

import com.codexbox.springboot.app.renuProjects.assessments.EmployeeDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {


	public static void main(String[] args) {
		List<EmployeeDetails> details = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 2; i++) {
			System.out.println("Enter the employee " + i + " details");
			System.out.println("Enter employee name: ");
			String name = sc.nextLine();
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			System.out.println("Enter employee address: ");
			String address = sc.next();

			EmployeeDetails employee = new EmployeeDetails(name, id, address);
			details.add(employee);
		}
		for (EmployeeDetails emplist : details) {
			System.out.println(emplist.getEmpid() + " " + emplist.getAddress() + " " + emplist.getEmpname());
		}

		System.out.println(" enter who is absent");

		String absent = sc.next();

		for (int i = 0; i < details.size(); i++) {
			if (details.get(i).getEmpname().equals(absent)) {
				System.out.println("enter employee name: ");
				String name = sc.next();
				System.out.println("enter employee id: ");
				int id = sc.nextInt();
				System.out.println("enter employee address: ");
				String address = sc.next();
				EmployeeDetails employee2 = new EmployeeDetails(name, id, address);
				details.set(i, employee2);

				for (i = 0; i < 1; i++) {
					details.get(i);
				}
			}
		}

	}
}
