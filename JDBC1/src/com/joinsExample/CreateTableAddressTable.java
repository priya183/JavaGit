package com.joinsExample;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTableAddressTable {
	
	public void createTable()
	{
		try
		{
			Connection conn=MySQLConnection.getConnection();
			String query="create table addressdto(aid int,address varchar(50), employeedto object)";
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
		CreateTableAddressTable c=new CreateTableAddressTable();
		c.createTable();
		
		
	}

}
