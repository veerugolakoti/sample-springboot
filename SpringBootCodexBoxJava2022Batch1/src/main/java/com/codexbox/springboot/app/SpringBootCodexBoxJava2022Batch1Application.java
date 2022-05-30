package com.codexbox.springboot.app;
import com.codexbox.springboot.app.dhivya.EmployeeList;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) {
		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		//LinkedListExample example = new LinkedListExample();
		//System.out.println(example.loadMyList());
		List<EmployeeList> employeeLists = new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i <=2; i++) {
			EmployeeList employeeList=new EmployeeList();
			System.out.println("Enter Employee   Details ");
			System.out.println("Enter Employee" + (i+1) + " Name : ");
			employeeList.setName(scanner.next());
			System.out.println("Enter Employee" + (i+1) + " Id : ");
			employeeList.setId(scanner.nextInt());
			System.out.println("Enter Employee" + (i+1) + "Address : ");
			employeeList.setAddress(scanner.next());
			employeeLists.add(employeeList);
		}
		for (int i = 0; i < employeeLists.size(); i++) {
			employeeLists.get(i).detils();
		}
		System.out.println("enter the absent name : ");
		String absent=scanner.next();
		for(int i = 0; i < employeeLists.size(); i++){
			EmployeeList emplist=new EmployeeList();
			if(employeeLists.get(i).getName().equalsIgnoreCase(absent)){
				System.out.println("Enter new employee name : ");
				emplist.setName(scanner.next());
				System.out.println("Enter new employee Id : ");
				emplist.setId(scanner.nextInt());
				System.out.println("Enter new employee Address: ");
				emplist.setAddress(scanner.next());

				employeeLists.set(i,emplist);
			}
		}
		for (int i = 0; i < employeeLists.size(); i++){
			employeeLists.get(i).detils();
		}
	}
}