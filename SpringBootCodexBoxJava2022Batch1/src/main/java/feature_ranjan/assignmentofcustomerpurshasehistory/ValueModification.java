package feature_ranjan.assignmentofcustomerpurshasehistory;

import java.sql.*;

public class ValueModification {
    public void databaseValueModification() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch3","root", "Smruti@94");
            preparedStatement = connection.prepareStatement("alter table customer_purchase_history modify column cadhar int(12)");

            preparedStatement.executeUpdate();

        }catch(SQLException | ClassNotFoundException e){
            System.out.println();
        }finally {
            if(resultSet != null && preparedStatement != null && connection != null ){
                resultSet.close();
                preparedStatement.close();
                connection.close();
            }
        }
    }
}
