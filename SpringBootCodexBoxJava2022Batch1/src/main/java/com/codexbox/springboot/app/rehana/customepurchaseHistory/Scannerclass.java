package com.codexbox.springboot.app.rehana.customepurchaseHistory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Scannerclass {
 public void insertCustomerDetails() throws SQLException {
  Scanner sc = new Scanner(System.in);
  System.out.println("number of customers to enter details");
  int numberofcustomers = sc.nextInt();
  for (int i = 0; i < numberofcustomers; i++) {
   System.out.println("*****Enter customer details***");
   System.out.println("enter customer id: ");
   int id = sc.nextInt();
   System.out.println("enter name: ");
   String name = sc.next();
   System.out.println("enter Aadhar number: ");
   String Aadhar_number = sc.next();
   System.out.println("enter phone number: ");
   String phone_number = sc.next();
   System.out.println("enter date of birth: ");
   String date_of_birth = sc.next();
   System.out.println("enter email: ");
   String Email = sc.next();
   System.out.println("enter address: ");
   String address = sc.next();
   Connection connection = null;
   PreparedStatement pstatement = null;

   try {
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehana_schema", "root", "Choti@123");
    String query = "insert into rehana_schema.customer values(?,?,?,?,?,?,?)";
    pstatement = connection.prepareStatement(query);
    pstatement.setInt(1, id);
    pstatement.setString(2, name);
    pstatement.setString(3, Aadhar_number);
    pstatement.setString(4, phone_number);
    pstatement.setString(5, date_of_birth);
    pstatement.setString(6, Email);
    pstatement.setString(7, address);
    pstatement.executeUpdate();

   } catch (SQLException e) {
    System.out.println("invalid details re enter the details ");
   } finally {
    pstatement.close();
    connection.close();
   }
  }
 }
}

