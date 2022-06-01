package com.codexbox.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		for (int i = 0; i < 2; i++) {

			Employee employee = new Employee();
			System.out.println("Enter the Employee "+(i+1)+" details : ");
			employee.setDetails();
			list.add(employee);
		}

		for (Employee emp : list) {
			emp.display();
		}

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name you want to remove : ");
		String str = in.nextLine();
		Employee emp= new Employee();
		for (int i = 0; i < list.size();i++) {
			if (list.get(i).getName().equalsIgnoreCase(str)){
				System.out.println("Enter new employee details");
				emp.setDetails();
				list.set(i,emp);
				break;
			}
		}

		for (Employee emp1 : list) {
			emp1.display();
		}

	}

}
