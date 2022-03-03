package com.employeeEx;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BatchUsingPS {
	
	public void executeBatch()
	{
		try
		{
			Connection conn=MySQLConnection.getMySQLConnection();
			String query="insert into employee(id,name)values(?,?)";
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, 104);
			pstmt.setString(2,"AA");
			pstmt.addBatch();
			pstmt.setInt(1, 105);
			pstmt.setString(2,"BB");
			pstmt.addBatch();
			int[] rowAffected=pstmt.executeBatch();
			System.out.println("rowAffected:"+rowAffected.length);
			for(int i:rowAffected)
			{
				System.out.println("Value of i="+i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
public static void main(String[] args) {
	
	BatchUsingPS b=new BatchUsingPS();
	b.executeBatch();
}
}
