package jdbcConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample {
    public void myPrepared() throws SQLException {

        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox-schema","root","kalyan1818@");

            String sql="insert into persons (PersonID,LastName,FirstName,DateOfBirth) values(?,?,?,?)";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,4);
            preparedStatement.setString(2,"ram");
            preparedStatement.setString(3,"pothuneani");
            preparedStatement.setString(4,"1998-04-8");


            int i=preparedStatement.executeUpdate();
            System.out.println(i+ " update new employee");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            preparedStatement.close();
            connection.close();

        }

    }

}
