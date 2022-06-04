package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vidyadarna.Employee;
import com.codexbox.springboot.app.vidyadarna.StudentAssesment;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Name;
import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {


//		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
//		List<Employee> employeeList = new ArrayList<>();
//
//		Scanner s = new Scanner(System.in);
//		for (int i = 0; i <= 3; i++) {
//			System.out.println("enter the " + (i + 1) + " employee name");
//			String EmployeeName = s.next();
//			System.out.println("enter the employee id");
//			int EmployeeId = s.nextInt();
//			System.out.println(" enter employee address");
//			String EmployeeAddress = s.next();
//			Employee employee = new Employee(EmployeeName, EmployeeId, EmployeeAddress);
//			employeeList.add(employee);
//
//		}
//		for (int i = 0; i <= 3; i++) {
//			//	System.out.println("the employee list is : " + employeeList.size());
//			employeeList.get(i).PrintDisplay();
//			System.out.println("&&&&&&&&&&&&&&&&&&&");
//		}
//		System.out.println("who is obsent");
//		String str = s.next();
//
//		for (int i = 0; i < employeeList.size(); i++) {
//
//			if (employeeList.get(i).getEmployeeName().equals(str)) {
//
//
//				System.out.println("enter new employee name");
//				String EmployeeName = s.next();
//				System.out.println("enter the employee id");
//				int EmployeeId = s.nextInt();
//				System.out.println(" enter employee address");
//				String EmployeeAddress = s.next();
//
//				Employee employee = new Employee(EmployeeName, EmployeeId, EmployeeAddress);
//				employeeList.add(employee);
//
//				employeeList.set(i, employee);
//			}
//		}
//		for (int i = 0; i < 3; i++) {
//			employeeList.get(i).PrintDisplay();
//     System.out.println("&&&&&&&&&&&&&&&&&&&");

//		}
		List<StudentAssesment> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		//int count = 0,j;
		Integer totalMarks = 600;

		Float percentage;


String Grade = null;

		for(int i = 0; i<3 ; i++){

			System.out.println("enter  " + (i+1) + " studentName ");
			String studentNmae = sc.next();
			System.out.println("enter studentId ");
			Integer studentId = sc.nextInt();
			System.out.println("enter studentAddress");
			String studentAddress = sc.next();
			System.out.println("enter your studentMarks");
			float studentMarks = sc.nextFloat();

			percentage = (studentMarks / totalMarks) * 100;
			System.out.printf("Grade : " + percentage);


			if (percentage >= 90) {
			Grade = "A";
			} else if (percentage>=60 && percentage <90) {
				Grade = "B";
			} else if (percentage>=35 && percentage <60) {
				Grade = "C";
			} else if (percentage <= 35) {
	            Grade = "D";
			}

			StudentAssesment student = new StudentAssesment(studentNmae,studentAddress,studentId,studentMarks,Grade);
			studentList.add(student);
		}
		for (int i = 0; i<3; i++){
			studentList .get(i).display();
		}
	}
}
