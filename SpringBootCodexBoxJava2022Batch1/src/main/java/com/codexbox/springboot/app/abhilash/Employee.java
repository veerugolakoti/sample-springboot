package com.codexbox.springboot.app.abhilash;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

   private Integer employee_id ;
    private String employee_name;
    private String address ;
    public Employee() {
    }
    public Employee(Integer employee_id, String employee_name, String address) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.address = address;
    }
    public void setDetails(){
       Scanner sc= new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        Employee emp = null;
            System.out.println("Enter employee details:");
            System.out.println("enter employee id");
            Integer eid = sc.nextInt();
            System.out.println("enter employee name");
            String name = sc.next();
            System.out.println("enter the address ");
            String address = sc.next();
        emp = new Employee(eid,name,address);
        list.add(emp);

    }



    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", address='" + address + '\'' +
                '}'+"\n";
    }
}
