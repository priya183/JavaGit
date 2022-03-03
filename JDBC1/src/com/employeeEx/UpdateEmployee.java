package com.employeeEx;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateEmployee {
	
	public void updateData(Employee emp)
	{
		try
		{
		Connection conn=MySQLConnection.getMySQLConnection();
		String id=emp.getId();
		Integer ii=Integer.parseInt(id);
		String name=emp.getName();
	    String	query="update employee set name=? where id=?";
	    PreparedStatement pstmt=conn.prepareStatement(query);
	    pstmt.setString(1, name);
	    pstmt.setInt(2, ii);
	    int rowAffected=pstmt.executeUpdate();
	    System.out.println("Generated query:"+query);
	    System.out.println("rowAffectes:"+rowAffected);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	
	
	UpdateEmployee u=new UpdateEmployee();
	Employee emp=new Employee("101","Jyoti");
	u.updateData(emp);
	
}
}
