package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Chandan.assessment3.EmployeesDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {


		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		/*LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());
		*/
		List<EmployeesDetails> empList = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		for(int i = 0; i <=2 ; i++) {
			System.out.println("Enter employee " + i + "Details");
			System.out.println("Enter employee name: ");
			String name = sc.next();

			System.out.println("Enter employee id: ");
			Long id = sc.nextLong();

			System.out.println("Employee address: ");
			String address = sc.next();

			EmployeesDetails emp = new EmployeesDetails(name, id, address);
			empList.add(emp);

		}

		System.out.println("Before removing: ");

		for(EmployeesDetails empl:empList) {
			System.out.println(empl.getEmployee_name() + " " + empl.getEmployee_ID() + " " + empl.getEmployee_Address());
		}

		System.out.println("Enter the id you want to remove; ");
		int num = sc.nextInt();
		empList.remove(num);

		System.out.println("After removing: ");

		for(EmployeesDetails empl:empList) {
			System.out.println(empl.getEmployee_name() + " " + empl.getEmployee_ID() + " " + empl.getEmployee_Address());
		}

		/*for(EmployeesDetails empDetails : list) {
			System.out.println(empDetails.getEmployee_ID());
			System.out.println(empDetails.getEmployee_name());
			System.out.println(empDetails.getEmployee_Address());*/
		System.out.println("Total employees:" +empList.size());
		}

	}


