package com.employeeEx;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTableEmployee {

public void createTable()
{
	try
	{
		Connection conn=MySQLConnection.getMySQLConnection();
		System.out.println("Connection Established......");
		Statement stmt=conn.createStatement();
		String query="create table employee(id int,name varchar(50))";
		int rowAffected=stmt.executeUpdate(query);
		System.out.println("rowAffected:"+rowAffected);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	
	CreateTableEmployee c=new CreateTableEmployee();
	c.createTable();
}
}
