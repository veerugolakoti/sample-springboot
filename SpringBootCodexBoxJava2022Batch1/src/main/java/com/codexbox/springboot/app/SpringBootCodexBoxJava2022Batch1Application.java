package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Veeru.Employee;
import com.codexbox.springboot.app.renuProjects.assessments.StudentDetails;
import com.codexbox.springboot.app.renuProjects.collections.enumerationExample.Weeks;
import com.codexbox.springboot.app.renuProjects.inputOutputStreams.InputStreamExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {/*{
		//int count = 1;
		*//*List<Employee> empList = new ArrayList<>();
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
	}
*//*


		List<StudentDetails> studentlist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
StudentDetails  studentDetails=null;
		for (int i = 0; i < 2; i++) {
			System.out.println("student " + i + " details");
			System.out.println("enter student id: ");
			int studentnum = scanner.nextInt();
			System.out.println("enter student name : ");
			String name = scanner.next();
			System.out.println("enter student address: ");
			String adress = scanner.next();
			System.out.println("enter student marks: ");
			int marks = scanner.nextInt();

			int grade = (int)(marks / 600) * 100;
			String s;

			if (grade > 90) {
				s = " Grade1";
			} else if (grade <= 90 && grade > 60) {
				s = " Grade2";
			} else if (grade <= 60 && grade > 35) {
				s = "Grade3";
			} else {
				s = " Grade4";

			}


			 studentDetails = new StudentDetails(studentnum, name, adress, marks, s);
			studentlist.add(studentDetails);
		}
			for (StudentDetails details : studentlist) {
				System.out.println(details.getStudentnum() + " " + details.getName() + " " + details.getAdress() + " " + details.getMarks() + " " + details.getGrade());

			}
			*//*Map<StudentDetails,String> studentvalues= new HashMap<>();
			List<Map.Entry<StudentDetails, String>> studentmap;
			Collections.sort(studentDetails, new Comparator<Map.Entry<StudentDetails, String>>() {
				@Override
				public int compare(Map.Entry<StudentDetails, String> o1, Map.Entry<StudentDetails, String> o2) {
					int result = 0;
					if (o2.getValue() != o1.getValue()) {
						result = o1.getValue().compareTo(o2.getValue());
					} else if (o1.getKey().getMarks() != o2.getKey().getMarks()) {
						result = o2.getValue().compareTo(o1.getValue());
					} else if () {

					}

				}

			});
*//*


	}*/



		/*System.out.println(Weeks.THURSDAY.getvalue());
		System.out.println(Weeks.FRIDAY.name());
		System.out.println(Weeks.valueOf(Weeks.SUNDAY.name()));
		Map<String,Integer> mymap=new HashMap<>();
		mymap.put("")
*/


		InputStreamExample inputStreamExample=new InputStreamExample();
		inputStreamExample.fileInputStreamMethod();



	}
}