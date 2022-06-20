package com.codexbox.springboot.app;

import com.codexbox.springboot.app.TejaAravind.practice.Sangam;
import com.codexbox.springboot.app.TejaAravind.practice.Student;
import com.codexbox.springboot.app.Veeru.Collections.StudentGradeAssessment;
import com.codexbox.springboot.app.sohailspringbootproject.collections.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {



	public static void main(String[] args) {
		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);


//		Sangam sangam = new Sangam();

//		sangam.getvalue();

//		System.out.println(sangam.driver);
//		System.out.println(sangam.url);







		/*StudentGradeAssessment assessment4 = new StudentGradeAssessment();
		assessment4.studentAndTheirGrades();*/
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
