package com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory;

import java.sql.*;
import java.util.Scanner;

public class InsertDetails {
   public void insertionDetails() throws SQLException, ClassNotFoundException {
       PreparedStatement prestatement1 = null;
       Connection connection1 = null;

//       Scanner scanner = new Scanner(System.in);
//       for (int i =1;i<3;i++) {
//           System.out.println("Enter CustomerId");
//           int id = scanner.nextInt();
//           System.out.println("Enter CustomerName");
//           String name = scanner.next();
//           System.out.println("Enter CustomerAadhaar");
//           Long aadhaar = scanner.nextLong();
//
//           System.out.println("Enter CustomerPhone");
//           Long phone = scanner.nextLong();
//           System.out.println("Enter CustomerDOB");
//           String dob = scanner.next();
//           System.out.println("Enter CustomerEmail");
//           String email = scanner.next();
//           System.out.println("Enter CustomerAddress");
//           String address = scanner.next();
       try {
           Scanner scanner = new Scanner(System.in);

           for (int i = 1; i < 3; i++) {
               System.out.println("Enter CustomerId");
               int id;
               id = scanner.nextInt();
               if (scanner.equals(id)) {

                   System.out.println("enter correct CustomerId  " + id);
               } else {
                   System.out.println("number already exist");
                   System.out.println("Enter CustomerId");
                   id = scanner.nextInt();
               }
               System.out.println("Enter CustomerName");
               String name = scanner.next();
               System.out.println("Enter CustomerAadhaar");
               Long aadhaar = scanner.nextLong();
//               if (scanner.equals(aadhaar)) {
//
//                   System.out.println("enter correct CustomerAadhaar  " + aadhaar);
//               } else {
//                   System.out.println("Enter CustomerAadhaar");
//                   Long aadhaar1 = scanner.nextLong();
//               }
               System.out.println("Enter CustomerPhone");
               Long phone = scanner.nextLong();
               System.out.println("Enter CustomerDOB");
               String dob = scanner.next();
               System.out.println("Enter CustomerEmail");
               String email = scanner.next();
               System.out.println("Enter CustomerAddress");
               String address = scanner.next();

               CustomerDetails customerDetails = new CustomerDetails();
               Class.forName("com.mysql.cj.jdbc.Driver");
               connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_example", "root", "Saiteja@27");
               String query1 = "INSERT INTO customer_table VALUES (?,?,?,?,?,?,?)";
               prestatement1 = connection1.prepareStatement(query1);
               prestatement1 = customerDetails.setCustomerDetails(id, name, aadhaar, phone, dob, email, address, prestatement1);
               prestatement1.execute();

           }
       }catch(ClassNotFoundException | SQLException e){
               System.out.println("you are enter duplicate elements");
               System.out.println("enter details again");
//           throw new RuntimeException(e);
           }
           finally{
               if (connection1 != null) ;
               connection1.close();
               if (prestatement1 != null) ;
               prestatement1.close();
           }
       }

   }

