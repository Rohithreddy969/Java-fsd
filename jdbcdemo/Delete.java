package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/products";
		String username = "root";
		String password = "Rohith@16052000";
		String query = "delete from product_items where product_id = '1479';";
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
