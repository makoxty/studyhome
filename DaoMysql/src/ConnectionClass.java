import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionClass {

	public static void main(String[] args) {
	    Connection conn = null;
	    try {
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springboot?characterEncoding=UTF-8&serverTimezone=JST&autoReconnect=true&useSSL=false", "makoto", "makoxty");
	        java.sql.Statement stmt = conn.createStatement();
	        String sql = "select id, title, body from mytable";
	        ResultSet rs = stmt.executeQuery(sql);
	        while (rs.next()) {
	            System.out.println(rs.getString("title"));
	            System.out.println(rs.getString("body"));
	        }
	        // このあたりはGCで解放されるがメモリ節約のためclose
	        rs.close();
	        stmt.close();
	    } catch (SQLException e) {
	        // TODO 自動生成された catch ブロック
	        e.printStackTrace();
	    } finally {
	        try {
	            if (null != conn) {
	                conn.close();
	            }
	        } catch (SQLException e) {
	            // TODO 自動生成された catch ブロック
	            e.printStackTrace();
	        }
	    }
	}

}



/*
CREATE TABLE music(
id INTEGER NOT NULL AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
title VARCHAR(50) NOT NULL,
year INTEGER(4) NOT NULL,
PRIMARY KEY(id)
);
*/