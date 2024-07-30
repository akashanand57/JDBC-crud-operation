package com.jspider.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProductController {
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
			String deleteProductQuery = "delete from product where id=425";
			
			//this method will return 0 or 1
			int a = statement.executeUpdate(deleteProductQuery);
			if(a==1) {
				System.out.println("data deleted successfully");
			} else {
				System.out.println("data will not deleted");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Data is not deleted...");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
