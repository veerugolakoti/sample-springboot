package feature_ranjan.assignmentofcustomerpurshasehistory;

import java.sql.*;

public class CustomerAlterQuery {
    public void alterQuery() throws SQLException {
        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch3", "root", "Smruti@94");

           // callableStatement = connection.prepareCall(" alter table customer_purchase_history add primary key(cid); ");
            callableStatement = connection.prepareCall("alter table customer_purchase_history add unique key(cmobno, cemail, cadhar)");
            callableStatement.execute();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null && callableStatement != null && connection != null) {
                resultSet.close();
                callableStatement.close();
                connection.close();
            }
        }
    }
}
