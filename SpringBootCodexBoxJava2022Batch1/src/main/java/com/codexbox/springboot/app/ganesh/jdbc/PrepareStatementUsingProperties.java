package com.codexbox.springboot.app.ganesh.jdbc;

import com.codexbox.springboot.app.ganesh.singleton.SingletonExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementUsingProperties {
    PreparedStatement ps ;
    Connection con ;

    public  void  test1() throws ClassNotFoundException, SQLException {

//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_schema","root", "Ganesh@1998");
SingletonExample singletonExample1 = SingletonExample.ld();
con =singletonExample1.test();


 ps= con.prepareStatement("insert into customer_details (?,?,?,?,?,?)");
        ps.setInt(1,20);
        ps.setLong(2,1254486533 );
        ps.setLong(3,255456664);
        ps.setString(4,"1985-02-15");
        ps.setString(5,"warangal");
                ps.setString(6,"nizambad@gmail.com");
        ps.execute();
    }



    }




