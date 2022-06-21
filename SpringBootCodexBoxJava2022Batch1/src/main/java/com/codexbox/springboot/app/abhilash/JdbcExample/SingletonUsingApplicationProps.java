package com.codexbox.springboot.app.abhilash.JdbcExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
@Configuration
public class SingletonUsingApplicationProps {
    private static Connection connection;
    private static SingletonUsingApplicationProps connectionforDB;

    @Value("${spring.datasource.driver}")
    private String driver;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password")
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private SingletonUsingApplicationProps() {

    }

    public SingletonUsingApplicationProps(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection getSingleton() {
        if (null == connection) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
    @Bean
    public static SingletonUsingApplicationProps getConnectionforDB() {
        if(null == connectionforDB) {
            connectionforDB = new SingletonUsingApplicationProps();
        }
        return connectionforDB;
    }
}


