package com.employeeEx;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	
	public static Connection getMySQLConnection()
	{
		Connection conn=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loading driver..");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		System.out.println("Establish Connection...");
		}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
		return conn;
	}
	public static void main(String[] args) {
		
		//MySQLConnection.getMySQLConnection();
		Connection con=MySQLConnection.getMySQLConnection();
	}
}
