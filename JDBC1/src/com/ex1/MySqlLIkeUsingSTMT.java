package com.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlLIkeUsingSTMT {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loaded Driver....");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		System.out.println("Connection established....");
		Statement stmt=conn.createStatement();
		String query="select * from mytable where name like 'p%'";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("Generated Query:"+query);
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			System.out.println(id+" "+name);
		}
		
	}

}
