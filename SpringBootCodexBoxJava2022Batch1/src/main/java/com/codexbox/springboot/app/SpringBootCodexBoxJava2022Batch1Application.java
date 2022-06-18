package com.codexbox.springboot.app;

//Test;
import com.codexbox.springboot.app.vidyadarna.StudentAssesment;
import com.codexbox.springboot.app.vidyadarna.coustmerPercheasDetails_Assesment.CustomerDetails;
import com.codexbox.springboot.app.vidyadarna.coustmerPercheasDetails_Assesment.CustomersEntryDetails;
import com.codexbox.springboot.app.vidyadarna.jdbcexample.JdbcExample;
import com.codexbox.springboot.app.vidyadarna.jdbcexample.PreparedStmtExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

import static org.springframework.core.OrderComparator.sort;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

//	private static Float studentMarks;
//	private static java.lang.Integer Integer;


	public static void main(String[] args) {

//		JdbcExample jdbc = new JdbcExample();
//		jdbc.jdbcExample();

//		PreparedStmtExample preparedStmtExample = new PreparedStmtExample();
//		preparedStmtExample.preparedexample();


	CustomersEntryDetails details = new CustomersEntryDetails();
	details.customerTable();


//        CustomerDetails Details = new CustomerDetails();
//		Details.customerDetails();


//		Test1 test = new Test1(EnumExample.MEDIUM);
//		test.orderPizza();


		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
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
//
//		}3

	/*	List<StudentAssesment> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of students");
		Integer TotalStudents = sc.nextInt();
		//int count = 0,j;
		Integer totalMarks = 600;


		for (int i = 0; i < TotalStudents; i++) {

				System.out.println("enter  " + (i + 1) + " studentName ");
				String studentName = sc.next();
				System.out.println("enter studentId ");
				Integer studentId = sc.nextInt();
				System.out.println("enter studentAddress");
				String studentAddress = sc.next();
				System.out.println("enter your studentMarks");
				float studentMarks = sc.nextFloat();

				StudentAssesment student = new StudentAssesment();

				student.setStudentId(studentId);
				student.setStudentAddress(studentAddress);
				student.setStudentMarks(studentMarks);
				student.setStudentName(studentName);
				studentList.add(student);
			}

			Map<StudentAssesment, String> studentGradeMap = new HashMap<>();

			System.out.println("Before sorting my Student details are : ");
			for (StudentAssesment student : studentList) {
				System.out.println("studentId : " + student.getStudentId());
				studentGradeMap.put(student, percentage((student.getStudentMarks() / totalMarks) * 100));
			}
			//	percentage = (studentMarks / totalMarks) * 100;
			//System.out.printf("Grade : " + percentage);
			List<Map.Entry<StudentAssesment, String>> studentAndGrades = new ArrayList<>(studentGradeMap.entrySet());
			sort(studentAndGrades);
		}

		public static String percentage ( float percentage){
			String Grade;


			if (percentage >= 90) {
				Grade = "A";
			} else if (percentage >= 60 && percentage < 90) {
				Grade = "B";
			} else if (percentage >= 35 && percentage < 60) {
				Grade = "C";
			} else if (percentage <= 35) {
				Grade = "D";
			} else {
				Grade = "E";
			}
			return Grade;
		}

	private static void sort(List<Map.Entry<StudentAssesment, String>> studentAndGrades) {
		Collections.sort(studentAndGrades, new Comparator<Map.Entry<StudentAssesment, String>>() {
			@Override
			public int compare(Map.Entry<StudentAssesment, String> o1, Map.Entry<StudentAssesment, String> o2) {
				int result = 0;

				if (o2.getValue() == o1.getValue()) {

					if (o1.getValue().equalsIgnoreCase( o2.getValue()) ){
						if (o2.getKey() ==( o1.getKey())) {
							result = o1.getValue().compareTo(o2.getValue());
						} else if (o2.getKey().getStudentMarks() != o1.getKey().getStudentMarks()) {
							result = o2.getKey().getStudentMarks().compareTo(o1.getKey().getStudentMarks());
						} else if (o1.getKey().getStudentName(" ") .equalsIgnoreCase( o2.getKey().getStudentName(" "))) {
							result = o2.getKey().getStudentName(" ").compareTo(o1.getKey().getStudentName(" "));
						} else {
							result = o1.getKey().getStudentId().compareTo(o2.getKey().getStudentId());
						}


					}

					//return 0;
				}
				return result;
			}
		});


		System.out.println("After sorting Employee Details are");
		for (Map.Entry<StudentAssesment, String> entry : studentAndGrades) {
			System.out.println("student number " + entry.getKey().getStudentId() + " : " + entry.getValue());

		}
*/
	}
}