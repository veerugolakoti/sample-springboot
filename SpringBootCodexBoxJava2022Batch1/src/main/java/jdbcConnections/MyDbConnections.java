package jdbcConnections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyDbConnections {
    static Connection connection=null;
    static PreparedStatement preparedStatement=null;
    public static void mydataBaseConnection() throws SQLException {

        DataBaseConnection dataBaseConnection=new DataBaseConnection();

        connection=dataBaseConnection.myDatabaseExample();
        String query="insert into customer value(?,?,?,?)";

        preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,6);
        preparedStatement.setString(2,"charan");
        preparedStatement.setString(3,"konidhella");
        preparedStatement.setString(4,"1998-04-8");

        int i=preparedStatement.executeUpdate();
        System.out.println(i+ " update new customer");
    }
}
