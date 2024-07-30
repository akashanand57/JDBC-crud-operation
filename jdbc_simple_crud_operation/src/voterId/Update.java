package voterId;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
Connection connection = null;
		
		try {
			// step-1 load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step-2 create connection
			String url= "jdbc:mysql://localhost:3306/jdbc-a3";
			String username= "root";
			String password= "7970";
			
			connection=DriverManager.getConnection(url, username, password);
			
			//Step-3 create statement
			Statement statement=connection.createStatement();
			
			// step-4 execute Query...
			String updateProductColorQuery = "update voterid set address='delhi' where id=126";
			
			//this method will return 0 or 1
			int a=statement.executeUpdate(updateProductColorQuery);
			
			if(a==1) {
				System.out.println("data updated");
			} else {
				System.out.println("given primary key is not present in the table");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
