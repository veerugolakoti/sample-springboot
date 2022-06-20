package com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory;

import com.sun.org.apache.bcel.internal.classfile.Code;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.sql.*;
import java.util.Scanner;

public class InsertDetails {
    public void insertionDetails() throws SQLException, ClassNotFoundException {

        CustomerDetails customerDetails = new CustomerDetails();
        PreparedStatement prestatement1 = null;
        Connection connection1 = null;

        try {
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i < 2; i++) {
                System.out.println("Enter CustomerId");
                int id;
                id = scanner.nextInt();
                System.out.println("Enter CustomerName");
                String name = scanner.next();
                System.out.println("Enter CustomerAadhaar");
                Long aadhaar = scanner.nextLong();
                System.out.println("Enter CustomerPhone");
                Long phone = scanner.nextLong();
                System.out.println("Enter CustomerDOB");
                String dob = scanner.next();
                System.out.println("Enter CustomerEmail");
                String email = scanner.next();
                System.out.println("Enter CustomerAddress");
                String address = scanner.next();

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
            if (prestatement1 != null) prestatement1.close();
            if (connection1 != null) connection1.close();
        }
    }

}

