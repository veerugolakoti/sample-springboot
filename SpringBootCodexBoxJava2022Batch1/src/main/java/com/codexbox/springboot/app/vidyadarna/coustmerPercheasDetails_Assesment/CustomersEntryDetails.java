package com.codexbox.springboot.app.vidyadarna.coustmerPercheasDetails_Assesment;

import java.sql.*;
import java.util.Scanner;

public class CustomersEntryDetails {
    public void customerTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter total customers");
        int num = scanner.nextInt();


        for (int i = 0; i < num; i++) {


            Connection connection = null;
            PreparedStatement statement = null;
            ResultSet resultSet = null;

            try {
//            Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1", "root", "vidyacodexbox");
                String Query1 = ("insert into customerDetails values(? ,? ,? ,? ,? ,? ,? )");
                statement = connection.prepareStatement(Query1);


                System.out.println("enter the customer Name : ");
                String CustomerName = scanner.next();
                statement.setString(1, CustomerName);

                System.out.println("enter the customer id :");
                int coustomerId = scanner.nextInt();
                statement.setInt(2, coustomerId);

                System.out.println("enter the customer Email : ");
                String CustomerEmail = scanner.next();
                statement.setString(3, CustomerEmail);

                System.out.println("enter the customer Aadharno : ");
                long aadharno = scanner.nextLong();
                statement.setLong(4, aadharno);

                System.out.println("enter the customer PhoneNo :");
                long phoneNo = scanner.nextLong();
                statement.setLong(5, phoneNo);

                System.out.println("enter the customer Date of birth :");
                String dateOfBirth = scanner.next();
                statement.setString(6, dateOfBirth);

                System.out.println("enter the customer Address: ");
                String customerAddress = scanner.next();
                statement.setString(7, customerAddress);


                statement.execute();
                int i1 = statement.executeUpdate(Query1);
//                System.out.println("successfully");

        } catch (SQLException e) {
           throw new RuntimeException(e);
        } finally {
                try {
                    if (statement != null)
                        connection.close();
                } catch (SQLException se) {}
                try {
                    if (connection != null)
                        connection.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
//                System.out.println("please again enter the details");
        }
    }
}
