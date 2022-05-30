package com.codexbox.springboot.app;
import assessment3.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);

		List<Employee> list = new java.util.ArrayList<>();
		Scanner sc=new Scanner(System.in);

		for (int i=1;i<=2;i++) {
			System.out.println(">>>>Employee " +i+ " details<<<<");
			System.out.print(" Empid :");
			String Id=sc.next();
			System.out.print(" EmpName:");
			String Name=sc.next();
			System.out.print(" EmpAddress:");
			String Address=sc.next();

			Employee employee=new Employee(Id,Name,Address);
			list.add(employee);
		}
		System.out.println("my total employee :");
		for (Employee e:list) {
			System.out.println(e.id+" : "+e.name+" : "+e.address);
		}
	}
}
