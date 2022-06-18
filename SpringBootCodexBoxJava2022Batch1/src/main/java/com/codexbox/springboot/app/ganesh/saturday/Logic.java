package com.codexbox.springboot.app.ganesh.saturday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Logic {
    public void service(int noc) throws SQLException {
        Connection con = null;

        PreparedStatement ps = null;
        try {
            Scanner s = new Scanner(System.in);



            int id = 0;
            long aadhar = 0;
            long phno = 0;
            String emid = null;
            String add = null;
            String dob = null;

            for (int i = 1; i <= noc; i++) {

                {
                    System.out.println("Enter the custmor no " + i + " id");
                    id = s.nextInt();
                    System.out.println("Enter the custmor no " + i + " aadhar");
                    aadhar = s.nextLong();
                    System.out.println("Enter the custmor no " + i + " phone number");
                    phno = s.nextLong();
                    System.out.println("Enter the custmor no " + i + " date of birth");
                    dob = s.next();
                    System.out.println("Enter the custmor no " + i + "  address");
                    add = s.next();
                    System.out.println("Enter the custmor no " + i + " Email id ");
                    emid = s.next();

                }

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_schema", "root", "Ganesh@1998");

                ps = con.prepareStatement
                        ("INSERT INTO customer_details VALUES(?,?,?,?,?,?)");
                ps.setInt(1, id);
                ps.setLong(2, aadhar);
                ps.setLong(3, phno);
                ps.setString(4, dob);
                ps.setString(5, add);
                ps.setString(6, emid);

                ps.execute();

            }


        }catch (SQLException e) {
            System.out.println("data is duplicated. enter the new data of customer");
            Logic logic1 = new Logic();
            logic1.service(noc);

        } finally {
            if (con != null) {
                con.close();
                ps.close();
            }


        }

    }

}
