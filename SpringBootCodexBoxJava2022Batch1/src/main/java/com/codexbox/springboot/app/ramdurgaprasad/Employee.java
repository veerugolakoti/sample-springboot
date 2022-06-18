package com.codexbox.springboot.app.ramdurgaprasad;

import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);
    private String name=sc.next();
    private  long empid = sc.nextInt();
    private String city = sc.next();

/*    private String name;
    private  long empid ;
    private String city ;
    public Employee(String name,long empid,String city){
        this.name=name;
        this.empid=empid;
        this.city=city;
    }*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getEmpid() {
        return empid;
    }
    public void setEmpid(long empid) {
        this.empid = empid;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}

