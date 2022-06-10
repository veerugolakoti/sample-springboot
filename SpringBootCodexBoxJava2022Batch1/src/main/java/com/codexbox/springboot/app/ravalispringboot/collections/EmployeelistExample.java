package com.codexbox.springboot.app.ravalispringboot.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeelistExample {

    public String Empname;
    public int Empid;
    public String Empaddress;


    public EmployeelistExample(String name, int id, String address) {
        this.Empname = name;
        this.Empid = id;
        this.Empaddress = address;


    }

    public String getEmpname() {
        return Empname;
    }

    public int getEmpid() {
        return Empid;
    }

    public String getEmpaddress() {
        return Empaddress;
    }

    public void printData() {
    }

    public void set(int i, EmployeelistExample emp) {
    }


   // }
}
