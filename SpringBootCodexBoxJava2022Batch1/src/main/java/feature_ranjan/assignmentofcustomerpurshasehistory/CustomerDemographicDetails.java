package feature_ranjan.assignmentofcustomerpurshasehistory;

import java.sql.*;
import java.util.Scanner;

public class CustomerDemographicDetails {
    public void customerDetails() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter customer demographic details\n");
        System.out.println("enter how many customer u want");
        int num = scanner.nextInt();
        for(int i=0; i<=num; i++) {
            System.out.println("enter customer id :");
            int id = scanner.nextInt();
            System.out.println("enter customer name :");
            String cname = scanner.next();
            System.out.println("enter customer address :");
            String caddress = scanner.next();
            System.out.println("enter customer adhar :");
            long cadhar = scanner.nextLong();
            System.out.println("enter customer dob :");
            int cdob = scanner.nextInt();
            System.out.println("enter customer mobile no :");
            long cmobNo = scanner.nextLong();
            System.out.println("enter customer email :");
            String cemail = scanner.next();

            Connection connection = null;
            CallableStatement callableStatement = null;
            ResultSet resultSet = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch3", "root", "Smruti@94");
                callableStatement = connection.prepareCall("insert into customer_purchase_history values(?,?,?,?,?,?,?)");

                callableStatement.setInt(1, id);
                callableStatement.setString(2, cname);
                callableStatement.setString(3, caddress);
                callableStatement.setLong(4, cadhar);
                callableStatement.setInt(5, cdob);
                callableStatement.setLong(6, cmobNo);
                callableStatement.setString(7, cemail);

                callableStatement.execute();

           /* while(resultSet.next()){
                System.out.println(resultSet.getInt("cid")+ "-" + resultSet.getString("cname")+ "" +
                        "-" +resultSet.getString("caddress") + resultSet.getLong("cadhar") + resultSet.getInt("cdob")+
                        "-" + resultSet.getLong());
            }*/

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);

            }catch (SQLIntegrityConstraintViolationException e) {
                System.out.println("Enter details is not valid or available ! please enter correct details:");
                CustomerDemographicDetails customerDemographicDetails = new CustomerDemographicDetails();
                customerDemographicDetails.customerDetails();
            }catch (SQLException e) {
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
}
