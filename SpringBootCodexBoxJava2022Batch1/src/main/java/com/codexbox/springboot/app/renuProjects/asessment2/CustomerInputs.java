package com.codexbox.springboot.app.renuProjects.asessment2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;
import java.util.Scanner;

public class CustomerInputs {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    public void customerDetails() {

        try {
            Scanner scanner = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_batch1", "root", "renuka");
            String str = "insert into customer_details values(?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(str);
            for (int i=1; i<3; i++) {
                System.out.println("enter "+i+ " customer details");
                System.out.println("enter customer id: ");
                long customer_id = scanner.nextLong();
                statement.setLong(1, customer_id);

                System.out.println("enter customer name: ");
                String customer_name = scanner.next();
                statement.setString(2, customer_name);

                System.out.println("enter customer email address: ");
                String customer_email = scanner.next();
                statement.setString(3, customer_email);

                System.out.println("enter customer adhar no: ");
                long adhar_no = scanner.nextLong();
                statement.setLong(4, adhar_no);

                System.out.println("enter phone number: ");
                long ph_no = scanner.nextLong();
                statement.setLong(5, ph_no);

                System.out.println("enter date of birth: ");
                String customer_DOB = scanner.next();
                statement.setString(6, customer_DOB);

                System.out.println("enter your address: ");
                String address = scanner.next();
                statement.setString(7, address);

                statement.executeUpdate();
            }

        } catch (SQLIntegrityConstraintViolationException e){
            System.out.println("customer id is repeated please reenter");
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        } finally {

            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }
    }
}