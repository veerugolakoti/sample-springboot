package com.codexbox.springboot.app.rajat.assessment5;

import com.codexbox.springboot.app.rajat.jdbc.JdbcEmployee;
import com.codexbox.springboot.app.rajat.jdbc.SingleJdbcConnection;

import java.sql.*;
import java.util.Scanner;

public class InputCustomerData {
    public void setCustomerData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many empolyee details do you want to insert");
        int num =sc.nextInt();


            Connection connection = null;
            PreparedStatement pStatement = null;
//        ResultSet resultSet = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = SingleJdbcConnection.getSinglConnection();
                String query = "insert into Customer_Demographic_Detail values(?,?,?,?,?,?,?)";
                pStatement = connection.prepareStatement(query);
                for (int i = 1 ; i <= num ; i++) {

                    System.out.println("Enter Customer_Id::");
                    int id = sc.nextInt();
                    System.out.println("Enter  Customer_name::");
                    String name = sc.next();
                    System.out.println("Enter  Customer_Dob::");
                    String dob = sc.next();
                    System.out.println("Enter  Customer_Address::");
                    String address = sc.next();
                    System.out.println("Enter  Phone -No::");
                    long phNo = sc.nextLong();
                    System.out.println("Enter  Addhar-No::");
                    long addhar = sc.nextLong();
                    System.out.println("Enter  Email::");
                    String email = sc.next();


                    pStatement.setInt(1, id);
                    pStatement.setString(2, name);
                    pStatement.setString(3, dob);
                    pStatement.setString(4, address);
                    pStatement.setLong(5, phNo);
                    pStatement.setLong(6, addhar);
                    pStatement.setString(7, email);
                    int resultSet=0;
                    try {

                      resultSet = pStatement.executeUpdate();
                        System.out.println(resultSet);
                        System.out.println("Update " + i + " Customer Successfully");
                    } catch (SQLIntegrityConstraintViolationException r) {
                            System.out.println("Plz input valid data.....");
                            Exception exception=new Exception();
                            exception.getCustomer();

                    }
                }

               ShowCustomerTableData customerTableData = new ShowCustomerTableData();
               customerTableData.getCustomer();


            } catch (SQLException | ClassNotFoundException  e) {
                throw new RuntimeException(e);
            } finally {

                try {
                    if (pStatement!=null) {
                        pStatement.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


    }


}
