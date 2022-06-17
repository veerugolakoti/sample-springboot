package feature_ranjan.jdbc;

import java.sql.*;

public class JdbcExample {
    public void getDatabase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch3", "root", "Smruti@94");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from employee_codexbox");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("eid") + "-" + resultSet.getString("ename") + "-"  + resultSet.getLong("esalary") + "-"  + resultSet.getString("eaddress"));
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {

        }

    }
}
