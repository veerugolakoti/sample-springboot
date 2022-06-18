package com.codexbox.springboot.app.ramdurgaprasad.mysqlexample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class MySqlExampleMain {
    public List<Student> method() throws SQLException {
        Connection conn =null;
        Statement st = null;
        ResultSet res = null ;
        List<Student> lists = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samplecode", "root", "Hitm@n0808");
            String query = "select * from student";
            st = conn.createStatement();
            res = st.executeQuery(query);
            while (res.next()) {
                Student student = new Student();
                student.setStudent(res.getInt("Student"));
                student.setLastname(res.getString("LastName"));
                student.setFirstname(res.getString("FirstName"));
                student.setAddress(res.getString("Address"));
                student.setCity(res.getString("City"));
                lists.add(student);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(res != null)
                res.close();
            if(st!=null)
                st.close();
            if(conn!=null)
                conn.close();
        }


        return lists;
    }
}

