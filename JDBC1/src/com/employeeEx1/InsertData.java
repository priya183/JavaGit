package com.employeeEx1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertData {
	
	public void insertData(Employee emp)
	{
		try
		{
			Integer id=emp.getId();
			String name=emp.getName();
		Connection conn=MySQLConnection.getConnection();
		String query="insert into employee2(id,name)values(?,?)";
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		int rowAffected=pstmt.executeUpdate();
		System.out.println("Generated query:"+query);
		System.out.println("rowAffected:"+rowAffected);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			}
	public static void main(String[] args) {
		
		InsertData i=new InsertData();
		Employee e=new Employee(105,"Priya");
		i.insertData(e);
	}

}
