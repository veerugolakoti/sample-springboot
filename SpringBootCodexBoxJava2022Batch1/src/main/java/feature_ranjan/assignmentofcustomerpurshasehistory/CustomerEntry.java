package feature_ranjan.assignmentofcustomerpurshasehistory;

import java.sql.*;
import java.util.Scanner;

public class CustomerEntry {
    public void customerEntry() throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch3", "root", "Smruti@94");
            statement = connection.createStatement();
            String query = "create table customer_purchase_history (cid int, cname varchar(50), caddress varchar(150), cadhar long, cdob int, cmobno long, cemail varchar(150))";

           statement.execute(query);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null && statement != null && connection != null) {
                resultSet.close();
                statement.close();
                connection.close();


            }
        }
    }
}
