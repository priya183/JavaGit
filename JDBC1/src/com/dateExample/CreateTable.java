package com.dateExample;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
	
	public void creaTable()
	{
		try
		{
			Connection conn=MySQLConnection.getConnection();
			Statement stmt=conn.createStatement();
			String query="create table mydateandtime(id int,name varchar(50),date date,time time)";
			int rowAffected=stmt.executeUpdate(query);
			System.out.println("Generated query:"+query);
			System.out.println("rowAffected:"+rowAffected);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		CreateTable c=new CreateTable();
		c.creaTable();
	}

}
