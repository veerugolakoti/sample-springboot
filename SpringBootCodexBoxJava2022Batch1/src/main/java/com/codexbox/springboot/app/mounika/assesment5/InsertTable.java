package com.codexbox.springboot.app.mounika.assesment5;

import java.sql.*;
import java.util.Scanner;

public class InsertTable {
    Connection connection = null;
    PreparedStatement stmt = null;

    public void customervalues() {


        try{

                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codex_java", "root", "Mounika");
                String query = "insert into customerdetails values (?, ?, ? ,? ,? ,? )";
            stmt = connection.prepareStatement(query);

                Scanner sc = new Scanner(System.in);

                System.out.print("enter the customer id");
                int id = sc.nextInt();
                stmt.setInt(1, id);

                System.out.print("enter the customer name");
                String name=sc.next();
                stmt.setString(2, name );

                System.out.print("enter the customer aadhar");
                String aadhar =sc.next();
                stmt.setString(3,aadhar);

                System.out.print("enter the customer phone number");
                int phonenumber =sc.nextInt();
                stmt.setInt(4, phonenumber);

                System.out.print("enter the customer dob");
                String dob = sc.next();
                stmt.setString(5, dob);

                System.out.println("enter the customer email");
                String email= sc.next();
                stmt.setString(6, email);

              stmt.executeUpdate();
                System.out.println("rows updated");
            }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

            } catch (SQLException ex) {
            System.out.println("entered  duplicate element");


        }
    }
        }







