package com.codexbox.springboot.app.dhivya.jdbc;

public class EmployeeList {
    private Integer EmployeeId;
    private String EmployeeName;
    private String EmployeeAddress;
    private Long Salary;

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }
}
