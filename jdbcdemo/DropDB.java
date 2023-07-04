package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropDB {
	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		String query = "Drop database products;";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = con.createStatement();
			stmt.execute(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}
