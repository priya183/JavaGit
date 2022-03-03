package com.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded driver class...");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("Connection established...");
			Statement stmt=conn.createStatement();
			/*String query1="insert into mytable(id,name)values(101,'Priya')";
			int rowAffected=stmt.executeUpdate(query1);
			System.out.println("rowAffected:"+rowAffected);
			*/
			//OR
			String id="102";
			String name="'Neha'";
			String query2="insert into mytable(id,name)values("+id+","+name+")";
			int rowAffected1=stmt.executeUpdate(query2);
			System.out.println("rowAffected:"+rowAffected1);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
