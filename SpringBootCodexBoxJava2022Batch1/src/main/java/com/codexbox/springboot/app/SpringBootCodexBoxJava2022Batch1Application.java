package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ramdurgaprasad.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<Employee>();
		System.out.println("enter the details");
		for(int i=1;i<=3;i++) {
			System.out.println("the employee"+i+" name,id,address:");
			Employee emp = new Employee();
			employeeList.add(emp);
			} int count =1;
		for (Employee list :employeeList) {

			System.out.println("the name,id,address of employee "+count++);
			System.out.print(list.getName() + ",");
			System.out.print(list.getEmpid()+",");
			System.out.print(list.getCity());
			System.out.println(" ");

		}


		}


	}


