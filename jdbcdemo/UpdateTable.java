package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/products";
		String username = "root";
		String password = "Rohith@16052000";
		String query = "Update product_items SET product_price = '95000' where product_id = '2451';";
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
