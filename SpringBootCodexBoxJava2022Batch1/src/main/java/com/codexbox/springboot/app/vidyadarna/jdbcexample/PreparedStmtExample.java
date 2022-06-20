package com.codexbox.springboot.app.vidyadarna.jdbcexample;

import com.codexbox.springboot.app.vidyadarna.coustmerPercheasDetails_Assesment.CodexDataBaseSingleTon;

import java.sql.*;

public class PreparedStmtExample {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet rs = null;

    public  void    preparedexample() {
//        step 1 load the jdbc driver
        try {
            CodexDataBaseSingleTon codexDataBaseSingleTon = new CodexDataBaseSingleTon();
            codexDataBaseSingleTon.getCodexDataBaseSingleTon();
            //            Class.forName("com.mysql.cj.jdbc.Driver");
////         step 2 get connection
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1", "root", "vidyacodexbox");
//         step 3 create Statement
          String Query = "filtter into Persons(PersonId,LastName,FirstName)values(?,?,?)";

            statement = connection.prepareStatement(Query);
            statement.setInt(1,101);
            statement.setString(2,"ravali");
            statement.setString(3,"fdf");

//            statement.setInt(1,11);
//            statement.setString(2,"mounika");
//            statement.setString(3,"shiva");

//            int i  = statement.executeUpdate();
//            System.out.println(i);
            rs = statement.executeQuery("SELECT * FROM Persons");
            while (rs.next()){
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            }
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                rs.close();
                statement.close();
                connection.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        }

    }
}