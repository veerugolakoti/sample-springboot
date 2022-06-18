package CustemerAssessment;

import java.sql.*;

public class Custemer {
   public void createTable(){
       Connection connection= null;
       Statement stmt = null;
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch_1","root","@nagarjuna");
String query="create table customer(id int,name varchar(40),address varchar(50),aadhar int(30) UNIQUE KEY,phonenumber int(20) UNIQUE KEY,dob  DATE,email varchar(55) UNIQUE KEY,PRIMARY KEY(id))";
          /* Scanner sc=new Scanner(System.in);
           System.out.println("enter id");*/

/* String col1="insert into customer values(1,'naga','knl',7474833476,'2022-06-11')";
  String col2="insert into customer values(2,'mani','hyd',7474833476,'2022-06-12')";
  String col3="insert into customer values(3,'lokesh','ban',7474833476,'2022-06-13')";
  String col4="insert into customer values(4,'siva','chennai',7474833476,'2022-06-14')";
  String col5="insert into customer values(5,'mahesh','pune',5757676865,'2022-06-15')";
  String col6="insert into customer values(6,'suresh','mumbai',5474853456,'2022-06-16')";
  String col7="insert into customer values(7,'srinu','atp',5771666546,'2022-06-17')";
  String col8="insert into customer values(8,'harsha','wnp',63454354355,'2022-06-18')";
  String col9="insert into customer values(9,'deepti','kkl',74748374441,'2022-06-19')";
  String col10="insert into customer values(10,'basha','ndl',578599459,'2022-06-20')";*/
//String query1="select * from customer";
 stmt=connection.createStatement();
         stmt.execute(query);
           /*stmt.execute(col1);
           stmt.execute(col2);
           stmt.execute(col3);
           stmt.execute(col4);
           stmt.execute(col5);
           stmt.execute(col6);
           stmt.execute(col7);
           stmt.execute(col8);
           stmt.execute(col9);
           stmt.execute(col10);*/
         /*  ResultSet rs=stmt.executeQuery(query);
//           if(rs!=null)
               while(rs.next()){
                   System.out.println("id of the customer"+rs.getInt(1));
                   System.out.println("name of the customer"+rs.getString(2));
                   System.out.println("address of the customer"+rs.getString(3));
                  System.out.println("addhar number of the customet "+rs.getString(4));
                   System.out.println("phone number of the customer"+rs.getString(5));
                   System.out.println("booking date "+rs.getDate(6));
              }*/

       } catch (ClassNotFoundException | SQLException e) {
           throw new RuntimeException(e);
       }finally {
           try {
               stmt.close();
               connection.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }


   }

}
