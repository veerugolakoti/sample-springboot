package com.codexbox.springboot.app.jdbc;

public class Employee {
    private int employee_id ;
    private String employeeName;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeePM_salary() {
        return employeePM_salary;
    }

    public void setEmployeePM_salary(int employeePM_salary) {
        this.employeePM_salary = employeePM_salary;
    }

    private int employeePM_salary;
}
