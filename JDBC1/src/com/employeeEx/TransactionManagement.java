

package com.employeeEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagement {
	
	public static void main(String[] args) throws Exception
	{
		TransactionManagement t=new TransactionManagement();
		t.manageTransaction();
	}
	public void manageTransaction() throws Exception
	{
		Connection conn=null;
	try
	{
		 conn=MySQLConnection.getMySQLConnection();
		conn.setAutoCommit(false);//by default value is true
		PreparedStatement pstmt=conn.prepareStatement("insert into employee(id,name)values(?,?)");
		pstmt.setInt(1, 106);
		pstmt.setString(2, "CC");
		int rA=pstmt.executeUpdate();
		System.out.println("Generated Query:"+pstmt);
		System.out.println("introwAffected:"+rA);
		//NullPointerException n=new NullPointerException();
		//throw n;
		
	}catch(Exception e)
	{
		conn.rollback();
		e.printStackTrace();
	}
	conn.commit();
	}

}
