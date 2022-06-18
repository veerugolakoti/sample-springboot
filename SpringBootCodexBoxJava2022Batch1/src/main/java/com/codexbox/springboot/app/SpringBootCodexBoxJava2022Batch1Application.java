package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Veeru.Collections.StudentGradeAssessment;
import com.codexbox.springboot.app.Veeru.employee.Employee;
import com.codexbox.springboot.app.Veeru.enumeration.Seasons;
import com.codexbox.springboot.app.rajat.assessment5.CreateCustomerDemographicDetailTable;
import com.codexbox.springboot.app.rajat.assessment5.InputCustomerData;
import com.codexbox.springboot.app.rajat.assessment5.ShowCustomerTableData;
import com.codexbox.springboot.app.rajat.jdbc.DeleteOperation;
import com.codexbox.springboot.app.rajat.jdbc.ExecuteUpdateMethod;
import com.codexbox.springboot.app.rajat.jdbc.JdbcCallableStatement;
import com.codexbox.springboot.app.rajat.jdbc.JdbcPrepairedStatement;
import com.codexbox.springboot.app.rajat.multithreading.MyThreadOne;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*JdbcPrepairedStatement jdbcPrepairedStatement = new JdbcPrepairedStatement();
		jdbcPrepairedStatement.getEmployee();
		ExecuteUpdateMethod executeUpdateMethod = new ExecuteUpdateMethod();
		executeUpdateMethod.setEmployee();
		JdbcCallableStatement jdbcCallableStatement = new JdbcCallableStatement();
		jdbcCallableStatement.getStoreAndRetriveData();

		DeleteOperation deleteOperation = new DeleteOperation();
		deleteOperation.getEmployee();*/

		CreateCustomerDemographicDetailTable demographicDetailTable = new CreateCustomerDemographicDetailTable();
		demographicDetailTable.createTable();
		InputCustomerData inputCustomerData = new InputCustomerData();
		inputCustomerData.setCustomerData();
		ShowCustomerTableData showCustomerTableData = new ShowCustomerTableData();
		showCustomerTableData.getCustomer();




















		/*	*//*	*//**//*StudentGradeAssessment assessment4 = new StudentGradeAssessment();
		assessment4.studentAndTheirGrades();*//**//*
		 *//**//*Map<String, Integer> myHashMap = new HashMap<>();
		myHashMap.put("Name1", 1);
		myHashMap.put("Name1", 2);
		myHashMap.put(null, 3);
		myHashMap.put(null, 4);
		System.out.println(myHashMap.get(null));

		System.out.println(myHashMap);*//*

		List<Integer> testNumbers = new ArrayList<>();
		testNumbers.add(1);
		testNumbers.add(2);
		testNumbers.add(3);
		System.out.println(Seasons.SUMMER.name());
		System.out.println(Seasons.SPRING.ordinal());
		System.out.println(Seasons.SPRING.getValue());

	*//*ListIterator myIterator = testNumbers.();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
			myIterator.previous()
		}

		for
		}*//**//*


	} *//**//*{
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
}

