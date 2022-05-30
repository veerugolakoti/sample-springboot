package com.codexbox.springboot.app.sangam.collections;

import java.util.Scanner;

public class Employeelist {
    private Integer id;
    private String name;
    private String address;
    public void employeedetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter id");
        this.id = Integer.parseInt(in.nextLine());
        System.out.println("enter name");
        this.name = in.nextLine();
        System.out.println("enter address");
        this.address = in.nextLine();


        for (int i = 1; i<29 ; i++) {
            Employeelist emp = new Employeelist();
            System.out.println("employee " +(i+1)+" details");
            emp.employeedetails();

        }

    }

}

