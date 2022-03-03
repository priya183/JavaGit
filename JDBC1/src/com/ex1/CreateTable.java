package com.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class CreateTable {
	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded driver class....");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("Established Connection...");
			Statement stmt=conn.createStatement();
			String query="create table myTable(id int, name varchar(50))";
			int rowAffected=stmt.executeUpdate(query);
			System.out.println("rowaffected:"+rowAffected);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
