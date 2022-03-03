package com.employeeEx1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {
	
	public void updateData(Employee emp)
	{
		try
		{
			Connection conn=MySQLConnection.getConnection();
			Integer id=emp.getId();
			String name=emp.getName();
			String query="update  employee2 set name=? where id=?";
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
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
	UpdateData u=new UpdateData();
	Employee emp=new Employee(102,"Chirag");
	u.updateData(emp);
}
}
