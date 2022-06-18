package com.codexbox.springboot.app.HarshaDeepthi.CustomerPurchaseHistory;

import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import java.sql.*;
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

public class CustomersInputs {
    Connection connection = null;
    PreparedStatement stmt=null;
    public void customerInputs(){
        try{

            Scanner scr=new Scanner(System.in);
            System.out.println("Enter Customer demographic Details");
            int number=scr.nextInt();
            for(int i=0;i<number;i++) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox", "root", "harsha");
                String query = "insert into CustomerDetails values(?,?,?,?,?,?,?)";
                stmt = connection.prepareStatement(query);
                System.out.println("Enter the Customer id: ");
                int ID = scr.nextInt();
                stmt.setInt(1, ID);
                System.out.println("Enter the Customer name: ");
                String Name = scr.next();
                stmt.setString(2, Name);
                System.out.println("Enter the Customer Address: ");
                String Address = scr.next();

                    stmt.setString(3, Address);
                System.out.println("Enter the Adharnumber: ");
                int Adharnumber = scr.nextInt();

                    stmt.setInt(4, Adharnumber);
                System.out.println("Enter the Phonenumber: ");
                int Phonenumber = scr.nextInt();

                    stmt.setInt(5, Phonenumber);
                System.out.println("Enter Dob:");
                String Dob = scr.next();
                    stmt.setString(6, Dob);
                System.out.println("Enter Email: ");
                String Email = scr.next();

                    stmt.setString(7, Email);
                stmt.executeUpdate();
                System.out.println("rows inserted sucessfully");
            }

        } catch (SQLException e) {
            System.out.println("This is already utilized and u entered duplicated ");;
        }
        try{
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
