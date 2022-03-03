package com.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLAlias {

public static void main(String[] args) throws Exception {
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loaded driver class....");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		System.out.println("Established Connection...");
		String query=" select id as 'myid',name as 'myname' from mytablecopy";
		PreparedStatement stmt=conn.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		System.out.println("Generated query:"+query);
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			System.out.println(id+" "+name);
		}
}
}