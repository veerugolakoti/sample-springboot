package com.codexbox.springboot.app;

import com.codexbox.springboot.app.TejaAravind.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	/*public static void main(String[] args) {
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

	}*/


	public static void main(String[] args) {
		System.out.println("Welcome to Grade sorting App");
		System.out.println("Enter the number of Students : ");
		Scanner inp = new Scanner(System.in);
		int numOfStudents;
//		String num = inp.nextLine();
//		if (!num.getClass().getSimpleName().equals()) {
//			System.out.println("Enter the value in Integer");
//		}

		try {
			numOfStudents = Integer.parseInt(inp.nextLine());


			List<Student> list = new ArrayList<>(numOfStudents);

			for (int i = 0; i < numOfStudents;i++) {
				Student student = new Student();
				System.out.println("Enter the Student "+(i+1)+ " Details");
				System.out.println("Enter the Student Roll No : ");
//				String rollNo = inp.nextLine();
//				if (rollNo.getClass().getSimpleName().equals("String")) {
//					System.out.println("Enter the value in Integer");
//				}
				student.setRollNo(Integer.parseInt(inp.nextLine()));
				System.out.println("Enter the Student Name : ");
				student.setName(inp.nextLine());
				System.out.println("Enter the Student Address : ");
				student.setAddress(inp.nextLine());
				System.out.println("Enter the Student marks out of 100 : ");
				int marks = Integer.parseInt(inp.nextLine());
				student.setMarks(marks);
				student.calulateGrade(student.getMarks());
				list.add(student);
			}
			System.out.println("Before Sorting : ");
			for (Student student : list) {
				student.display();
			}


			Collections.sort(list, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getGrade().equalsIgnoreCase(o2.getGrade())) {
						if (o2.getName().equalsIgnoreCase(o1.getName())){
							if (o2.getMarks() == o1.getMarks()){

								return o1.getRollNo().compareTo(o2.getRollNo());
							}

							return o2.getMarks().compareTo(o1.getMarks());
						}
						return o1.getName().compareTo(o2.getName());


					}
					return o1.getGrade().compareTo(o2.getGrade());

				}
			});


			System.out.println("After Sorting");
			for (Student student : list) {
				student.display();
			}

//

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}




