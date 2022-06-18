package com.codexbox.springboot.app.dhivya.jdbc;

import java.sql.*;
import java.util.Scanner;

public class CustomerPurchaseHistory {
    Connection connection = null;
    PreparedStatement statement = null;

    public void insertingCustomerDetails() {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch", "root", "Dhivya");

            String query1 = "Insert Into Customer_Demographic Values(?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(query1);
            System.out.print("Enter the number of customers : ");
            int no = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < no; i++) {



                System.out.print("Enter id: ");
                int id = Integer.parseInt(sc.nextLine());
                statement.setInt(1, id);

                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                statement.setString(2, name);

                System.out.print("Enter Address: ");
                String address = sc.nextLine();
                statement.setString(3, address);

                System.out.print("Enter Aadhar: ");
                int aadhar = Integer.parseInt(sc.nextLine());
                statement.setInt(4, aadhar);

                System.out.print("Enter phone: ");
                int phone = Integer.parseInt(sc.nextLine());
                statement.setInt(5, phone);

                System.out.print("Enter DOB: ");
                String dob = sc.nextLine();
                statement.setString(6, dob);

                System.out.print("Enter Email: ");
                String email = sc.nextLine();
                statement.setString(7, email);


                statement.executeUpdate();
                System.out.println("inserted values");
                //String query = "Select * from employee";
            }
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLIntegrityConstraintViolationException ec) {
            System.out.println("Entered ID is already exist...please enter a different ID number");
            ExceptionHandling exceptionHandling=new ExceptionHandling();
            exceptionHandling.exceptionHandlingDuplicateValue();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {

                if (null != statement) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (null != connection) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
}