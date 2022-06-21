package jdbcConnections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseConnection {
    private static Connection connection=null;
    @Value("${datasource.driver}")
    private  String driver;
    @Value("${spring.application.url}")
    private  String url;
    @Value("${datasource.user}")
    private  String user;
    @Value("${datasource.password}")
    private  String password;
    public DataBaseConnection(){

    }
    public Connection myDatabaseExample() throws SQLException {
        try {
            Class.forName(driver);
            return DriverManager.getConnection("","", "");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (null !=connection)connection.close();
        }
    }
}

