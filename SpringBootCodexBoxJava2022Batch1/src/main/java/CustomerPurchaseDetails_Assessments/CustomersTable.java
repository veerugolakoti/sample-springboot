package CustomerPurchaseDetails_Assessments;

import java.sql.*;

public class CustomersTable {
    Connection connection = null;
    Statement statement = null;
    public void customer() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java", "root", "shiva");
            statement = connection.createStatement();
            String table = "create table CustomersDetails (CustomerId int primary key, CustName varchar(50), Address varchar(50) unique key, DOB varchar(50), Aadhar bigint unique key, Email varchar(20) unique key, Phone_number bigint unique key)";
            statement.executeUpdate(table);
            System.out.println("Created");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(null != statement) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(null != connection) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
