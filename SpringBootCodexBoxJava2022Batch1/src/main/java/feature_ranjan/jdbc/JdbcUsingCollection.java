package feature_ranjan.jdbc;


import java.sql.*;
import java.util.Scanner;

public class JdbcUsingCollection {
    public void getDatabase() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the eid no : ");
        int id = scanner.nextInt();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch3", "root", "Smruti@94");
            preparedStatement = connection.prepareStatement("select * from student where sid =? ");
            preparedStatement.setInt(1,id);
          /*  preparedStatement.setString(2,"Dipti");
            preparedStatement.setString(3,"Bhubaneswar");*/

           /* int i = preparedStatement.executeUpdate();
            System.out.println(i);*/

           resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt("sid")+ "-" + resultSet.getString("sname")+ "-" +resultSet.getString("saddress"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(preparedStatement != null && connection !=null ) {
             try {
                 preparedStatement.close();
             }catch(SQLException e){
                 throw new RuntimeException(e);
             }
             try{
                 connection.close();
             }catch(SQLException e){
                 throw new RuntimeException(e);
             }
            }

        }


    }

}
