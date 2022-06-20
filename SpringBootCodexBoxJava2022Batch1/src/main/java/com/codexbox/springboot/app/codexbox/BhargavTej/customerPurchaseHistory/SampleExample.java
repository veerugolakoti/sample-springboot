package com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.CountedCompleter;

public class SampleExample {
    public void testMethod() throws SQLException {
        CodexBoxConnection codexBoxConnection = CodexBoxConnection.getConnectionDB();
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = codexBoxConnection.getConnectionDriver();
            pstmt = connection.prepareStatement("INSERT INTO customer_table VALUES (?,?,?,?,?,?,?)");
            pstmt.setInt(1, 2);
            pstmt.setString(2, "bhargav");
            pstmt.setLong(3,15484854);
            pstmt.setLong(4,12547986);
            pstmt.setString(5, "14554");
            pstmt.setString(6,"dfgdfgfhfhf");
            pstmt.setString(7,"dgdfdgfdg" );

            pstmt.executeQuery();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
