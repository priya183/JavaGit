package com.employeeEx;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEmployeeName {
	
	public void deleteName(Employee emp)
	{
		try
		{
		Connection conn=MySQLConnection.getMySQLConnection();
		System.out.println("Established Connection...");
		String name=emp.getName();
		String query="delete from employee where name=?";
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setString(1, name);
		int rowAffected=pstmt.executeUpdate();
		System.out.println("Generated query:"+query);
		System.out.println("rowAffected:"+rowAffected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		DeleteEmployeeName d=new DeleteEmployeeName();
		Employee e=new Employee("10","Pooja");//("0","Pooja");
		d.deleteName(e);
	}

}
