package com.codexbox.junaidspringboot.app.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication
{

    public static void main(String[] args) {
        List<Employee> listArray = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter  " + i  + " another employee details");
            System.out.println("Plz enter Name : ");
            String name = scanner.nextLine();
            System.out.println("Plz enter Address : ");
            String address = scanner.nextLine();
            System.out.println("Plz enter IdNum : ");
            String empId = (scanner.nextLine());


//            listArray= new ArrayList<>();

            Employee obj = new Employee(name,address,empId);
            listArray.add(obj);
        }

        for (int i = 0; i < 2; i++) {
          listArray.get(i).printEmployee();
        }

    }

}
