package com.dateExample;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	
	public static Connection getConnection()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully.....");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("Established connection....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		

	getConnection();
			
}}
