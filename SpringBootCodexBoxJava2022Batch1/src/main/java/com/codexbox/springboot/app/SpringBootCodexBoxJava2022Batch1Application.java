package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Veeru.Collections.StudentGradeAssessment;
import feature_ranjan.enumeration.EnumExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*StudentGradeAssessment assessment4 = new StudentGradeAssessment();
		assessment4.studentAndTheirGrades();*/


		for (EnumExample enumexample : EnumExample.values()) {
			System.out.println(enumexample.getValue());
		}
		System.out.println(" spring :"+EnumExample.SPRING.getValue());
		//EnumExample.valueOf(EnumExample.RAINY.getValue());
	}

	/*{
		//int count = 1;
		List<Employee> empList = new ArrayList<>();
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
		System.out.println("My total employees : " + empList.size());
	}*/

}
