package com.dateExample;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDateAndTime {
	
	public static void main(String[] args) {
		
	
	
	
	try
	{
		Connection conn=MySQLConnection.getConnection();
		java.util.Date date=new java.util.Date();
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
		String query="insert into mydateandtime(id,name,date,time)values(?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, 101);
		pstmt.setString(2, "Priya");
		pstmt.setDate(3, sqlDate);
		pstmt.setTimestamp(4, sqlTime);
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
