package com.dateExample;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDate {
	
	public static void main(String[] args) {
		
		
		try
		{
			Connection conn=MySQLConnection.getConnection();
			java.util.Date date=new java.util.Date();
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			String query="insert into mydate(id,name,date)values(?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, 102);
			pstmt.setString(2, "Meena");
			pstmt.setDate(3, sqlDate);
			int rowAffected=pstmt.executeUpdate();
			System.out.println("Generated query:"+query);
			System.out.println("rowAffected:"+rowAffected);
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
