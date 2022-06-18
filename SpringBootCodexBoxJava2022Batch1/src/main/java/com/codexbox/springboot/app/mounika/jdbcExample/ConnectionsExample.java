package com.codexbox.springboot.app.mounika.jdbcExample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionsExample {
    public void personsDetails(){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        List<PersonsDetails> list= new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codex_java", "root", "Mounika");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * from persons");

            while (resultSet.next()) {
                PersonsDetails person = new PersonsDetails();
                person.setId(resultSet.getInt("Id"));
                person.setFirstname(resultSet.getString("FirstName"));
                person.setLastname(resultSet.getString("LastName"));
                person.setAge(resultSet.getInt("Age"));
                list.add(person);
            }
            for (PersonsDetails ps: list) {
                System.out.println(ps.getId());
                System.out.println(ps.getFirstname());
                System.out.println(ps.getLastname());
                System.out.println(ps.getAge());

            }



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(resultSet!=null)
                    resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(statement!=null)
                    statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(connection!=null)
                    connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
