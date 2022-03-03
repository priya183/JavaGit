package com.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {
	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Established Connection...");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("Connection established...");
			Statement stmr=conn.createStatement();
			String query="select * from mytable";
			ResultSet rs=stmr.executeQuery(query);
			while(rs.next())
			{
				int i=rs.getInt("id");
				String n=rs.getString("name");
				System.out.println("id="+i+", Nmae="+n);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
