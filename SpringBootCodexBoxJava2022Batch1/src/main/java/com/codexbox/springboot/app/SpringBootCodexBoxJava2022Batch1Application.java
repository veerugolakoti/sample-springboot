package com.codexbox.springboot.app;

import CustemerAssessment.Custemer;
import CustemerAssessment.CustomerDetails;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		//int count = 1;
		/*List<Employee> empList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 29 ; i++) {

			System.out.println("Enter Employee" + i + " Details: ");
			System.out.println("Enter emp name: ");
			String name = scanner.next();
			System.out.println("Enter emp id: ");
			Integer id = scanner.nextInt();
			System.out.println("Enter emp address: ");
			String address = scanner.next();

			Employee employee = new Employee(name, id, address);
			empList.add(employee);
		}
		System.out.println("My total employees : " + empList.size());*/
		/* JdbcExamples1 jdbcExamples=new JdbcExamples1();
		List<Student> student=jdbcExamples.getDetails();
		for (Student stdlist:student) {
			System.out.println(stdlist.getSid());
			System.out.println(stdlist.getSname());
			System.out.println(stdlist.getSmarks());
			System.out.println(stdlist.getSgrade());*/
		/*JdbcPrepare prepare=new JdbcPrepare();
		prepare.getDetails();*/
		/*Custemer custemer=new Custemer();
		custemer.createTable();*/

		CustomerDetails customerDetails=new CustomerDetails();
		customerDetails.createCustomerDetails();




		}


	}


