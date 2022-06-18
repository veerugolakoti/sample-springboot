package customerpurchasehistory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
   // public static void main(String[] args) {


        public void createTable(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/siva_sql", "root", "Siva@9999");
                Statement s1 = c1.createStatement();
                String query = "CREATE TABLE CUSTOMER_TABLE " +
                        "(id INTEGER not null ,customer_name VARCHAR(200),aadhaar_number BIGINT(46) ,phone_number BIGINT(50), date_of_birth VARCHAR(34)," +
                        " customer_email VARCHAR(200),customer_address VARCHAR(255),"+
                        " PRIMARY KEY ( id ))";
                s1.executeUpdate(query);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }


