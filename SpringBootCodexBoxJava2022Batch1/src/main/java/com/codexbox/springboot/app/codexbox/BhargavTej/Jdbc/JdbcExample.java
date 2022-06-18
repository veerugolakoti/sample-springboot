package com.codexbox.springboot.app.codexbox.BhargavTej.Jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
   public List<Employee> getEmployessData(){
       //Step-1 load driver
       List<Employee> employeeList = new ArrayList<>();
       Connection connection=null;
       Statement statement =null;
       ResultSet rset =null;
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           //Step-2 get connection
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_example", "root", "Saiteja@27");
           statement = connection.createStatement();
           String query = "SELECT * FROM sql_example.employeedetails;";
           rset = statement.executeQuery(query);
           while(rset.next()){
               Employee employee = new Employee();
               employee.setId(rset.getInt("employee_id"));
               employee.setName(rset.getString("employee_name"));
               employee.setSalary(rset.getLong("employee_salary"));
               employee.setAddress(rset.getString("employee_address"));
               employeeList.add(employee);
           }
           for (Employee emp :employeeList) {
               System.out.println(emp.getId());
               System.out.println(emp.getName());
               System.out.println(emp.getSalary());
               System.out.println(emp.getAddress());
           }
       }
        catch (SQLException | ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
       finally {
           try {
               rset.close();
               statement.close();
               connection.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
       return employeeList;
   }
}
