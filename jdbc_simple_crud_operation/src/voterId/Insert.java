package voterId;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		
		try {
			// Step1 Load / Register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step2 Create Connection
			String url="jdbc:mysql://localhost:3306/jdbc-a3";
			String username="root";
			String password="7970";
			Connection connection=DriverManager.getConnection(url, username, password);
			
			// Step3 Create Statement
			Statement statement=connection.createStatement();
			
			// Step4 execteQuery
//			String insertQuery= "insert into voterid(id,name,dob,address,fatherName,gender) values(127,'mohan','2000-01-25','noida','manmohan','male')";
//			String insertQuery1= "insert into voterid(id,name,dob,address,fatherName,gender) values(124,'sohan','2000-01-25','noida','manmohan','male')";
//			String insertQuery2= "insert into voterid(id,name,dob,address,fatherName,gender) values(125,'rohan','2000-01-25','noida','manmohan','male')";
//			String insertQuery3= "insert into voterid(id,name,dob,address,fatherName,gender) values(126,'shyammohan','2000-01-25','noida','manmohan','male')";
			String insertQuery4= "insert into voterid(id,name,dob,address,fatherName,gender) values(1278,'mohan','2000-01-25','noida','manmohan','male')";
//			statement.execute(insertQuery);
//			statement.execute(insertQuery1);
//			statement.execute(insertQuery2);
//			statement.execute(insertQuery3);
			statement.execute(insertQuery4);
			
			System.out.println("Data Stored Successfully.....");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Data not Stored.....");
		}
	}
}
