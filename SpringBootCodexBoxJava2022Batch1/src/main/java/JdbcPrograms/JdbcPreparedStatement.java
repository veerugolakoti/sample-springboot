package JdbcPrograms;


import java.sql.*;

public class JdbcPreparedStatement {
    public void preparedStatement() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedst = null;
        ResultSet result = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java", "root", "shiva");
            String query = "select * from persons where gender = ?";
            preparedst =  connection.prepareStatement(query);
            preparedst.setString(1,"Male");
            result = preparedst.executeQuery();
            while (result.next()) {
                System.out.print(result.getString(2) + "\t");
                System.out.print(result.getString(5) + "\n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
                result.close();
                preparedst.close();
                connection.close();
        }
    }
}
