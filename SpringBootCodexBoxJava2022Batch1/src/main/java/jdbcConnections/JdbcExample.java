package jdbcConnections;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    public List<Peoples> myJdbcExample() throws SQLException {
        List<Peoples> peoples=new ArrayList<>();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            //step 1 Load the drive
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step2 get the connection
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox-schema","root","kalyan1818@");

            //step3 write the query and create the Statement
            statement=connection.createStatement();

            //step4 execute the statement
            resultSet=statement.executeQuery("select * from persons");

            //step5 extratct result from Db
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("PersonID")+" : "+
                resultSet.getString("LastName")+" : "+
                resultSet.getString("FirstName")+" : "+
                resultSet.getString("Address")+" : "+
                resultSet.getString("DateOfBirth"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
        return peoples;
    }
}
