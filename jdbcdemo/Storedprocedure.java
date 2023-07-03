package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Storedprocedure {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/employee_details";
		String username = "root";
		String password = "root";
		String query = "call employee();";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Emp_ID: " + rs.getString("emp_id") + "\t");
			System.out.print("Emp_name: " + rs.getString("emp_name") + "\t");
			System.out.println("Designation: " + rs.getString("designation") + "\t");
		}
	}

}
