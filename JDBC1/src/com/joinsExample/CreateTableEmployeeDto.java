package com.joinsExample;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTableEmployeeDto {
	
	public void createTable()
	{
		try
		{
		Connection conn=MySQLConnection.getConnection();
		String query="create table employeedto(eid int, ename varchar(50))";
		PreparedStatement pstmt=conn.prepareStatement(query);
		int rowAffected=pstmt.executeUpdate();
		System.out.println("Generated Query:"+query);
		System.out.println("rowAffected:"+rowAffected);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	CreateTableEmployeeDto c=new CreateTableEmployeeDto();
	c.createTable();
}
}
