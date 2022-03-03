package com.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CopyTableEx {
	
	public static void main(String[] args) throws Exception {
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loaded driver class....");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		System.out.println("Established Connection...");
		Statement stmt=conn.createStatement();
		String query="create table mytablecopy select id,name from mytable";
		int rowAffected=stmt.executeUpdate(query);
		System.out.println("Generated query"+query);
		System.out.println("rowAffected:"+rowAffected);
	}

}
