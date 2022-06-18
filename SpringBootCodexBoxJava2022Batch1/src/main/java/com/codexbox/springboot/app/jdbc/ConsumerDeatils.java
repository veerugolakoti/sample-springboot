package com.codexbox.springboot.app.jdbc;

import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Scanner;
public class ConsumerDeatils {


    public void consumerDetails() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        //Statement statement = null;
        try {
            Scanner sc = new Scanner(System.in);
            // creating a connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_batch_java", "root", "Codex@123");

            // creating a statement
            String query = "insert into customerpurchasedetails Values(?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(query);
            for (int i = 0; i <= 1; i++) {
                System.out.println("Please Enter your ID details");
                int consumerID = sc.nextInt();
                statement.setInt(1, consumerID);

                System.out.println("Please enter your name");
                String consumerName = sc.next();
                statement.setString(2, consumerName);

                System.out.println("please enter your Aadhar UID");
                String consumerAadharUID = sc.next();
                statement.setString(3, consumerAadharUID);

                System.out.println("Please give your AddressDetails");
                String address = sc.next();
                statement.setString(4, address);

                System.out.println("Enter your phone no.");
                String phoneNo = sc.next();
                statement.setString(5, phoneNo);

                System.out.println("Enter your DOB");
                String dob = String.valueOf(sc.next());
                statement.setString(6, dob);

                System.out.println("Give your emailID");
                String email = sc.next();
                statement.setString(7, email);

            }
            statement.executeUpdate();
            System.out.println("Consumer details inserted successfully");
            } catch(SQLIntegrityConstraintViolationException v) {
            System.out.println("This ID already exists....Try with a different one");
        }  catch(SQLException e){
                throw new RuntimeException(e);
            } finally{
                try {
                    if (null != statement) statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    if (null != statement) connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);

                }


            }
        }
    }



