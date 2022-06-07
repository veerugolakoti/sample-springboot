package com.codexbox.springboot.app;

import com.codexbox.springboot.app.file.InputOutputStream;
import com.codexbox.springboot.app.studentdetails.StudentList;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
//		LinkedListExample example = new LinkedListExample();
//		System.out.println(example.loadMyList());


//		List<EmployeeDetails> list = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < 2; i++) {
//
//			System.out.println("enter employee  " + i + "  details");
//			//System.out.println();
//			EmployeeDetails employeeDetails = new EmployeeDetails();
//			System.out.println("enter employee name ");
//			employeeDetails.setName(sc.next());
//			System.out.println("enter employee id ");
//			employeeDetails.setId(sc.nextInt());
//			System.out.println("enter employee address");
//			employeeDetails.setAddress(sc.next());
//             list.add(employeeDetails);
//
//		}
//
//		for (int i=0;i<list.size();i++)
//
//		{
//			list.get(i).getDetails();
//		}
//		System.out.println("enter absent employee name");
//		Scanner scanner=new Scanner(System.in);
//		//EmployeeDetails scanner=new EmployeeDetails();
//
//		for(int i=0; i< list.size();i++){


		InputOutputStream inputOutputStream=new InputOutputStream();
		inputOutputStream.iooperation();



		/*List<StudentList> myStudentList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students :  ");
		int numberstudent =sc.nextInt();
		for(int i=1;i<=numberstudent;i++){
			StudentList studentList=new StudentList();
			System.out.println("enter student details : ");
			System.out.println("enter student" + i + " id :" );
			studentList.setStudentId(sc.next());
			System.out.println("enter student "+ i + " name");
			studentList.setStudentName(sc.next());
			System.out.println("enter student" + i + " address");
			studentList.setStudentAddress(sc.next());
			System.out.println("enter student" + i+ " marks");
			studentList.setStudentMarks(sc.nextInt());
			System.out.println("average "+ " " + studentList.setAverage());
			studentList.add(studentList);
		}
*/
	 }
		}



