package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ganesh.Scanner.Assessment.Students;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
//		StudentGradeAssessment assessment4 = new StudentGradeAssessment();
//		assessment4.studentAndTheirGrades();
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


//		Students students = new Students();
//		System.out.println(students.calculategrade(560));
//
//

		/////
//		IOFileHandling ioFileHandling =new IOFileHandling();
//		ioFileHandling.fileoperation();

///////
		{
			Scanner s = new Scanner(System.in);
			System.out.println("**********Enter the total no students************");
			int totalstudents = s.nextInt();
			List<Students> order = new LinkedList<>();

			for (int i = 1; i <= totalstudents; i++) {
				System.out.println("==========Enter the Students "+i+" Details============");
				System.out.println("Enter the Students numbeer");
				int number = s.nextInt();
				System.out.println("Enter the Students name");
				String name= s.next();
				System.out.println("Enter the Students address");
				String  address =s.next();
				System.out.println("Enter the Students marks");
				Integer marks= s.nextInt();
				Students  students = new Students(number,name,address,marks);
				order.add(students);

			}
			for (Students nostudents:order) {
				System.out.println(nostudents );

			}

		}



	}

}