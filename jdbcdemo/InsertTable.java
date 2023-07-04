package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/products";
		String username = "root";
		String password = "Rohith@16052000";
		String query = "insert into product_items value (2451, \"Apple\", 85000.50), (1553, \"Samsung\", 75000.00), (1479, \"Nokia\", 45000.80), (3548, \"Oneplus\", 49505.30);";
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
