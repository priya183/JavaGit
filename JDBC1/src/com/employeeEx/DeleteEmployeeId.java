package com.employeeEx;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEmployeeId {
	
	public void deleteEmployee(Employee emp)
	{
		try
		{
			Connection conn=MySQLConnection.getMySQLConnection();
			String id=emp.getId();
			Integer i=Integer.parseInt(id);
			String query="delete from employee where id=?";
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, i);
			int rowAffected=pstmt.executeUpdate();
			System.out.println("Generated Query:"+query);
			System.out.println("rowAffected"+rowAffected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		DeleteEmployeeId d=new DeleteEmployeeId();
		Employee emp=new Employee("104","'null'");//("104","'Vikas'");/("104","'aaa'");
		d.deleteEmployee(emp);
		
	}

}
