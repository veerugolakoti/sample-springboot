package com.codexbox.springboot.app;

import com.codexbox.springboot.app.dinesh202270.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
//		LinkedListExample example = new LinkedListExample();
//		System.out.println(example.loadMyList());
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

            Scanner input = new Scanner(System.in);

            System.out.println("Plz enter Name : ");
            String name = input.nextLine();
            System.out.println("Plz enter Address : ");
            String address = input.nextLine();
            System.out.println("Plz enter ContactNo : ");
            int id = input.nextInt();
            Employee employee = new Employee(name, address, id);
            employeeList.add(employee);
        }

               String abstent ="rajat";



        for (int i = 0; i < 2; i++) {
          //  if(employeeList.)
            employeeList.get(i).printData();
        }
    }


}
