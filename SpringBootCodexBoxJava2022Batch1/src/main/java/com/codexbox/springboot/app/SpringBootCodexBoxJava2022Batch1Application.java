package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ramdurgaprasad.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) {
		List<Employee> employeeList=new LinkedList<>();
		System.out.println("enter the details");
		Employee emp1 = new Employee();
		Scanner sc =new Scanner(System.in);
		for(int i=1;i<=2;i++) {
			System.out.println("the employee" + i + " name,id,address:");
	/*	String name=sc.next();
		long id=sc.nextLong();
		String add=sc.next();

			System.out.println("the employee" + i + " name,id,address:");
			Employee emp = new Employee(name,id,add);*/
			Employee emp = new Employee();
			employeeList.add(emp);
//			System.out.println(emp);
		}  int count =1;
		for (Employee list :employeeList) {
			System.out.println("the name,id,address of employee "+count++);
			System.out.print(list.getName() + ",");
			System.out.print(list.getEmpid()+",");
			System.out.print(list.getCity());
			System.out.println(" ");

		}
		System.out.println(employeeList.size());
		employeeList.set(1,emp1);
//		employeeList.remove(2);

	}
}


