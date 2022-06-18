package com.codexbox.springboot.app.TejaAravind.jdbc;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdbcExample {
    Connection connection;
//    Statement statement;
//    PreparedStatement statement;
    CallableStatement statement;
    ResultSet resultset;
    public List<Employee> getDetails(){
        List<Employee> empList = new ArrayList<>();
        // step 1 get the drivers and maven dependencies
        try {
        // step 2 register
            Class.forName("com.mysql.cj.jdbc.Driver");
        // step3 connection
            connection = SingleTonConnection.getConnection();
            System.out.println(connection.hashCode());

//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter the id : ");
//            int id = in.nextInt();
//            String query = "select * from employee;";
//            String query = "select * from employee where emp_name = 'sangam';";
//            String query = "insert into employee values (3,\"sohail\",\"hyd\", 20000,736247236);";
            String query = "select * from employee where emp_id = 1 ;";
            // step 4 create statement
//            statement = connection.createStatement();
//            statement.execute(query);
//            resultset = statement.executeQuery(query);

            // prepared statements
//            statement = connection.prepareStatement(query);
//            statement.setInt(1,id);
//            resultset = statement.executeQuery();

            // callable statement

//            statement = connection.prepareCall(query);
            String callStatement = "{ call GetAllDetails() }";
            statement = connection.prepareCall(callStatement);
            resultset = statement.executeQuery();


            // step 5
            while (resultset.next()){
                Employee employee = new Employee();
                employee.setEmpId(resultset.getInt("emp_id"));
                employee.setEmpName(resultset.getString("emp_name"));
                employee.setEmpAddress(resultset.getString("emp_address"));
                employee.setEmpSalary(resultset.getDouble("emp_salary"));
                employee.setPhoneNo(resultset.getInt("phoneNo"));
                empList.add(employee);
            }

              // step 6 extract data




        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (resultset != null || statement != null || connection != null){
                try {
//                resultset.close();
                statement.close();
                connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        return empList;


    }
}
