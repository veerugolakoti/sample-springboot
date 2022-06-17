package com.codexbox.springboot.app.abhilash.JdbcExample;

        import java.sql.*;
        import java.util.*;

public class PreparedstatementExample {
    public void establish() throws SQLException {
        System.out.println("Enter number of employees want to insert:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String id = null;
        String name = null;
        String address = null;
        for(int i = 0; i < number;i++){
            System.out.println("enter id");
            id = sc.next();
            System.out.println("enter name of employee");
            name = sc.next();
            System.out.println("enter address of employee");
            address = sc.next();
        }
        Connection connection = null;
//        Statement stmt = null;
//        ResultSet resultSet;
        PreparedStatement preparedStatement = null;
        //step1 :load driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // step 2: making connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox","root","ABHIL@sh123");
            //step 3: create statement
            String query = "insert into codexbox.employee values(?,?, ?)";
            //stmt = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);
            /*resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                System.out.println("[" + resultSet.getString("id")+" "+
                        resultSet.getString("name")+ " "+
                        resultSet.getString("address") +"]");
            }*/
            int i = preparedStatement.executeUpdate();
            System.out.println( i+ " new employee updated");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {

            if(null != preparedStatement)preparedStatement.close();
            if(null != connection)connection.close();
        }
    }
}

