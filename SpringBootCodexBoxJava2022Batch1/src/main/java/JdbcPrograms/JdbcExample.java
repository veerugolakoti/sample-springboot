package JdbcPrograms;

import java.sql.*;

import static java.lang.Class.forName;

public class JdbcExample {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    public void jdbcPrograms() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java", "root", "shiva");
            statement = connection.createStatement();
            resultset = statement.executeQuery("select * from persons");
            System.out.println("id" + "\t" + "firstName" + "\t" + "lastName");
            System.out.println("-------------------------");
            while(resultset.next()) {
                System.out.print(resultset.getInt(1) + "\t" );
                System.out.print(resultset.getString(2) + "\t" + "\t");
                System.out.print(resultset.getString(3) + "\n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                resultset.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
