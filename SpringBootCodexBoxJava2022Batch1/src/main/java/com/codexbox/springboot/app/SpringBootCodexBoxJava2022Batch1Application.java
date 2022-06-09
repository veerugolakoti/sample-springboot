package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ravalispringboot.assesment3.Student;
import com.codexbox.springboot.app.ravalispringboot.collections.Months;
import com.codexbox.springboot.app.ravalispringboot.inputoutputstrems.Bufferinputoutputstream;
import com.codexbox.springboot.app.ravalispringboot.inputoutputstrems.InputOutputStreamExample;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		Bufferinputoutputstream bufferinputoutputstream= new Bufferinputoutputstream();
		bufferinputoutputstream.bufferMethod();
		/*InputOutputStreamExample inputOutputStreamExample= new InputOutputStreamExample();
		inputOutputStreamExample.Inputoutputmethod();*/

		}


	}
//	SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);

		//System.out.println("Enter  std name: ");
		/*List<Student> stdlist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		float sum = 0;
		int subjects = 6;

		for (int i = 1; i <= 3; i++) {

			System.out.println("Enter student " + i + " Details: ");
			System.out.println("Enter  std name: ");
			String name = scanner.next();
			System.out.println("Enter std no: ");
			Integer sno = scanner.nextInt();
			System.out.println("Enter  std address: ");
			String saddress = scanner.next();
			System.out.println("enter std marks  : ");
			Integer smarks = scanner.nextInt();

			Student std = new Student(name, sno, saddress, smarks);
			std.Calculator();
			stdlist.add(std);
		}

		for (Student Std : stdlist) {
			System.out.println(Std.getSname() + " " + Std.getSno() + " " + Std.getSaddress() + " " + Std.getMarks() + "  " + Std.getGrade());
		}
		System.out.println("student marks  :");

		//Map<String, Integer> stud = new HashMap<String, Integer>();

		List<Map.Entry<Student, String>> Studentgrade = new ArrayList<>();

		Collections.sort(Studentgrade, new Comparator<Map.Entry<Student, String>>() {
			@Override
			public int compare(Map.Entry<Student, String> o1, Map.Entry<Student, String> o2) {
				int result = 0;

				if (o2.getValue() == o1.getValue()) {
					result = o1.getValue().compareTo(o2.getValue());

				} else if (o1.getKey().getMarks() == o2.getKey().getMarks()) {
					result = o2.getValue().compareTo(o1.getValue());

				} else if (o2.getKey().getSname() == (o1.getKey().getSname())) {
					result = o1.getValue().compareTo(o2.getValue());

				} else if (o1.getKey().getSaddress() == o1.getKey().getSaddress()) {
					result = o2.getValue().compareTo(o1.getValue());
				} else {

				}
				return result;
			}

		});

		for (Student sortedStd : stdlist){
			System.out.println(sortedStd.getSno()+" "+sortedStd.getMarks()+" "+sortedStd.getSaddress()+" "+sortedStd.getGrade());

		}
	}
}
*/





	/*
			List<StudentListExample>list=new LinkedList<>();
			stdlist.add(new StudentListExample("reka",6,"hyd",87));
			stdlist.add(new StudentListExample("rema" ,6,"hyd",89));
			stdlist.add(new StudentListExample("janu",7,"punne",90));

			for(StudentListExample std :list) {
				System.out.println(list);*/




	//	}


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
		System.out.println("My total employees : " + empList.size());
	}*/



