package com.codexbox.springboot.app.ganesh.singleton;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonExample {
    private static Connection con =null;
    private static   SingletonExample singletonExample = null;

    @Value("${DataBase_driver }")
    public  String driver;

    @Value("{DataBase_connection}")
    public String connection;
    @Value("{DataBase_username}")
    public String username;
    @Value("{DataBase_Password }")
    public String password;
    public  static SingletonExample ld() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample ;

    }
    public   Connection test() throws ClassNotFoundException, SQLException {
        if (con == null) {
            Class.forName(driver);
          con = DriverManager.getConnection(connection, username, password);

        }
            return con;
    }
    private SingletonExample() {
        System.out.println("Private constructor");

    }

}
