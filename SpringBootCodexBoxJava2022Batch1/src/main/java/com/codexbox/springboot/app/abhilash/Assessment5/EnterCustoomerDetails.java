package com.codexbox.springboot.app.abhilash.Assessment5;

import com.codexbox.springboot.app.abhilash.JdbcExample.SingletonConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static com.codexbox.springboot.app.abhilash.JdbcExample.SingletonConnection.connection;

public class EnterCustoomerDetails {
    public void enterdetails() {
        PreparedStatement preparedStatement = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers want to insert:");
        int number = sc.nextInt();
        Integer id = null;
        String name = null;
        Long aadhar = null;
        Long phone = null;
        String DOB = null;
        String gmail = null;
        String address = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            SingletonConnection.getInstance();
            for (int i = 0; i < number; i++) {
                System.out.println("enter id of customer details: ");
                id = sc.nextInt();
                System.out.println("enter name of customer: ");
                name = sc.next();
                System.out.println("enter Aadhar number of customer: ");
                aadhar = sc.nextLong();
                System.out.println("enter phone number:");
                phone = sc.nextLong();
                System.out.println("enter date of birth: ");
                DOB = sc.next();
                System.out.println("enter Gmail of customer");
                gmail = sc.next();
                System.out.println("enter address of customer");
                address = sc.next();
                String query = "insert into codexbox.customer_demographic_details values(?,?,?,?,?,?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setLong(3, aadhar);
                preparedStatement.setLong(4, phone);
                preparedStatement.setString(5, DOB);
                preparedStatement.setString(6, gmail);
                preparedStatement.setString(7, address);
                int j = preparedStatement.executeUpdate();
                System.out.println(j + " new employee updated");
            }
        }catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
            System.out.println("enter valid details");
            enterdetails();
        } finally {
                if (null != preparedStatement) {
                    try {
                        if (null != preparedStatement) {preparedStatement.close();}
                        if (null != connection) connection.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
