package com.codexbox.springboot.app.ganesh.jdbc;

import java.sql.*;

public class StatementExample {
    public void m1() throws SQLException {
        //step 1 load the driver
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 2 get the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_schema", "root", "Ganesh@1998");

            //Step 3 create statement
            stm = con.createStatement();
            // step 4   Execute the statement
            rs = stm.executeQuery("select * from employee");
            //step 5 execute quary
            while (rs.next()) {
                System.out.println(rs.getInt("eid"));
                System.out.println(rs.getString("employee_salary"));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (con!=null){
                con.close();
                stm.close();
                rs.close();
            }

        }

    }

}



