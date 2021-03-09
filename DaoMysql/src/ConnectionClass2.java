import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectionClass2 {

    static final String URL = "jdbc:mysql://localhost:3306/springboot?characterEncoding=UTF-8&serverTimezone=JST&autoReconnect=true&useSSL=false";
    static final String USERNAME = "makoto";
    static final String PASSWORD = "makoxty";

    public static void main(String[] args) {

        try (
                Connection connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
                Statement statement = (Statement) connection.createStatement();
                ) {
        	connection.setAutoCommit(false);

            String sql = "INSERT INTO music VALUES (1, 'Michael Jackson', 'Butterflies', 2001);";
            int result = statement.executeUpdate(sql);
            System.out.println("結果１：" + result);

            sql = "INSERT INTO music (name, title, year) VALUES ('Aril Brikha', 'Groove La Chord', 1998);";
            result = statement.executeUpdate(sql);
            System.out.println("結果２：" + result);
            connection.rollback();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}