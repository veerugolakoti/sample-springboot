package assment5;

import java.sql.*;

public class CustomerPurchaseDetails {
    public void createCustomerDetails() throws SQLException {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox", "root", "ramesh");
           statement = connection.createStatement();
            String query = "create table customer(cus_id int PRIMARY KEY, cus_name varchar(20), cus_dob varchar(10), cus_add varchar(200), cus_phno bigint UNIQUE, cus_mail_id varchar(20)UNIQUE);";


            statement.execute(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {


            if (null != statement) {
                statement.close();
            }
            if (null != connection) {
                connection.close();
            }
        }

    }
}


