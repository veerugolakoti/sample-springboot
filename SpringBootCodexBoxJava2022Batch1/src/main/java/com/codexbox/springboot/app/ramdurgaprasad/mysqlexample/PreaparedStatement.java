package com.codexbox.springboot.app.ramdurgaprasad.mysqlexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreaparedStatement {
    public void cricketerdetails() {
        PreparedStatement preparedstatement = null;

        try {            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samplecode", "root", "Hitm@n0808");
            preparedstatement = conn.prepareStatement("Select * from tbl_name where Student=?");
            preparedstatement.setInt(3,56);
            preparedstatement.setString(2,"ram");
            int result = preparedstatement.executeUpdate();
            System.out.println(result+ "updated the record");

        } catch (ClassNotFoundException |SQLException e) {
            throw new RuntimeException(e);

        }
    }
}
