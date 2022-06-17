package feature_ranjan.jdbc;

import java.sql.*;

public class StoredProcedureProgram {
    public void storedProcedure() throws SQLException {
        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch3", "root", "Smruti@94");
            callableStatement = connection.prepareCall("select * from student where sid = 2");
            resultSet = callableStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt("sid")+ "-" + resultSet.getString("sname")+ "-" +resultSet.getString("saddress"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(resultSet != null && callableStatement != null && connection != null){
                resultSet.close();
                callableStatement.close();
                connection.close();


            }
        }

    }
}
