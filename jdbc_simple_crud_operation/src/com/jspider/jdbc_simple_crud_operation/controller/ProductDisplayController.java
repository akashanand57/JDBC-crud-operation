package com.jspider.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDisplayController {
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
			String displayProductQuery = "Select * from product";
			
			ResultSet rs=statement.executeQuery(displayProductQuery);
			
			while(rs.next()) {
			
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String color = rs.getString("color");
			double price = rs.getDouble("price");
			System.out.println("Id is: "+id);
			System.out.println("Name is: "+name);
			System.out.println("Color is: "+color);
			System.out.println("Price is: "+price);
			System.out.println("======================");
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
