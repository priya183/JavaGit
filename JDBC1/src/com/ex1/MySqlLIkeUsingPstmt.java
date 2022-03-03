package com.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlLIkeUsingPstmt {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loaded Driver....");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		System.out.println("Connection established....");
		String query="select * from mytable where name like 'p%'";
		PreparedStatement pstmt=conn.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		System.out.println("Generated query:"+query);
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			System.out.println(id+" "+name);
		}
	}

}
