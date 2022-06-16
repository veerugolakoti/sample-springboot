package feature_ranjan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    public void getDatabase(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch3", "root", "Smruti@94");
            Statement statement = connection.createStatement();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
