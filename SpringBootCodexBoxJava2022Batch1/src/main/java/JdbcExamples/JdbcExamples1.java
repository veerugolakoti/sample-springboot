package JdbcExamples;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExamples1 {

        Connection connection= null;
        Statement statement = null;
//    PreparedStatement statement=null;
        ResultSet resultSet= null;

    public List<Student>getDetails(){
            List<Student> student=new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch_1","root","@nagarjuna");

            String query="select * from student where smarks>? and name=?";
            statement =connection.createStatement();

            resultSet =statement.executeQuery(query);
            while(resultSet.next()){
            Student student1=new Student();
            student1.setSid(resultSet.getInt("sid"));
            student1.setSname(resultSet.getString("sname"));
            student1.setSmarks(resultSet.getInt("smarks"));
            student1.setSgrade(resultSet.getString("sgrade"));
            student.add(student1);
            // System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+resultSet.getString(4));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }
return student;

    }
}


