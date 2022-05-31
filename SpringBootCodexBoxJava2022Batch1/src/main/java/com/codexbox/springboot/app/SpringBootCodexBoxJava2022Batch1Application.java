package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ravalispringboot.collections.EmployeelistExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		//	SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);

		List<EmployeelistExample> employeeList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 4; i++) {

			System.out.println("enter Employee List" + i + " details:");

			System.out.println("Employee name");

			String name = sc.next();

			System.out.println("Employee id ");

			int id = sc.nextInt();

			System.out.println("Employee address");

			String address = sc.next();


			EmployeelistExample employeelistExample = new EmployeelistExample(name, id, address);

			employeeList.add(employeelistExample);


		for (EmployeelistExample em : employeeList) {
			System.out.println(em.getEmpname() + " " + em.getEmpid() + " " + em.getEmpaddress());
		}


				//employeeList.remove(2);
				employeeList.add(employeelistExample);
				//mployeeList.add(2);

				System.out.println("enter is absent");

				String abs = sc.next();

				for (int i1 = 0; i < employeeList.size(); i++) {

					if ((employeeList.get(i)).getEmpname().equals(abs)) {
						System.out.println("enter new employee  Name:");
						String name1 = sc.next();
						System.out.println("enter new employee  address");
						String address1 = sc.nextLine();
						System.out.println("enter new employee id");
						int id1 = sc.nextInt();
						EmployeelistExample emp = new EmployeelistExample(name, id, address);
						employeeList.set(i, emp);
					}
				}

			}
			for (int i = 0; i < 4; i++) {
				employeeList.get(i).printData();
			}
		}
	}
