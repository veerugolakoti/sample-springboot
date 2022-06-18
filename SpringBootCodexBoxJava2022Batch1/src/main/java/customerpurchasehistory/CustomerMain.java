package customerpurchasehistory;

import java.sql.SQLException;

public class CustomerMain {
    public static void main(String[] args) throws SQLException {
           InsertDetails insertDetails = new InsertDetails();
           insertDetails.customerdetails();
    }
}