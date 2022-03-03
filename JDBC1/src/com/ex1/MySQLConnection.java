package com.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	
	public static void main(String[] args) {
		
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded dricer class....");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("Etablished Connection...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
