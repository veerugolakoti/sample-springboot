package com.codexbox.springboot.app.ganesh.jdbc;

import java.sql.*;

public class PreparedStatementExample {
    public void m2() throws SQLException {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_schema", "root", "Ganesh@1998");

            ps = con.prepareStatement("select*from UserReg41 limit 1");

            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("uname") + "\t" +
                        rs.getString("pword") + "\t" + rs.getString("lname"));
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (con!=null&&ps!=null&&rs!=null){
                con.close();
                ps.close();
                rs.close();
            }

        }


    }


}


