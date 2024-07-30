package com.jspider.jdbc_simple_crud_operation.controller;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInsertController {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		
		try {
			// step-1 load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step-2 create connection
			String url= "jdbc:mysql://localhost:3306/jdbc-a3";
			String username= "root";
			String password= "7970";
			
			Connection connection=DriverManager.getConnection(url, username, password);
			
			//Step-3 create statement
			Statement statement=connection.createStatement();
			
			// step-4 execute Query...
			System.out.println("Enter the ID: ");
			int id=sc.nextInt();
			System.out.println("Enter the Product Name: ");
			String name=sc.next();
			System.out.println("Enter the Product Price: ");
			int price=sc.nextInt();
			System.out.println("Enter the Product Color: ");
			String color=sc.next();
			
			
			String insertQuery = "insert into product(id,name,price,color) values(?, ?, ?, ?)";
			statement.execute(insertQuery);
			
//			String insertQuery = "insert into product(id,name,price,color) values(425,'marker','30','white')";
//			String insertQuery1 = "insert into product(id,name,price,color) values(422,'marker','30','blue')";
//			String insertQuery2 = "insert into product(id,name,price,color) values(423,'marker','30','orange')";
//			String insertQuery3 = "insert into product(id,name,price,color) values(424,'marker','30','black')";
//			statement.execute(insertQuery);
//			statement.execute(insertQuery1);
//			statement.execute(insertQuery2);
//			statement.execute(insertQuery3);
			
			System.out.println("Data Stored...");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Data not Stored...");
		}
		sc.close();
	}
}
