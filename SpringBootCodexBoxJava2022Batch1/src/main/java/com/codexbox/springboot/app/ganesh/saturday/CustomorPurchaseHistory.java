package com.codexbox.springboot.app.ganesh.saturday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomorPurchaseHistory {
    public void custmordemographicdetails() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the no of customer");
            int noc = s.nextInt();

            int id = 0;
            long aadhar = 0;
            long phno = 0;
            String emid = null;
            String add = null;
            String dob = null;

            for (int i = 1; i < noc; i++) {

                System.out.println("Enter the custmor no "+i+" id");
                id = s.nextInt();
                System.out.println("Enter the custmor no "+i+" aadhar");
                aadhar = s.nextLong();
                System.out.println("Enter the custmor no "+i+" phone number");
                phno = s.nextLong();
                System.out.println("Enter the custmor no "+i+" date of birth");
                dob = s.next();
                System.out.println("Enter the custmor no "+i+"  address");
                add = s.next();
                System.out.println("Enter the custmor no "+i+" Email id ");
                emid = s.next();

            }

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_schema","root", "Ganesh@1998");



             ps = con.prepareStatement
                    ("INSERT INTO customer_details VALUES(?,?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setLong(2, aadhar);
            ps.setLong(3, phno);
            ps.setString(4,dob );
            ps.setString(5, add);
            ps.setString(6, emid);

            int k = ps.executeUpdate();
            if (k > 0) {
                System.out.println("Update successfully");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        } finally {
            if (con != null && ps!=null) {
                con.close();
                ps.close();
            }

        }
    }


}
    /*
    CREATE TABLE UserReg41 (
        uname varchar(25),
    pword varchar(20),
    fname varchar(25),
    lname varchar(25),
    address varchar(250),
    mid varchar(50),
   phno long
           );*/