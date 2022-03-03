package com.employeeEx1;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
	
	public void createTable()
	{
		try
		{
			Connection conn=MySQLConnection.getConnection();
			Statement stmt=conn.createStatement();
			String query="create table employee2(id int,name varchar(50))";
			int rowAffected =stmt.executeUpdate(query);
			System.out.println("Generated query="+query);
			System.out.println("rowAffected:"+rowAffected);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	CreateTable c=new CreateTable();
	c.createTable();
	
}
}
