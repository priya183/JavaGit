package com.joinsExample;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.employeeEx1.MySQLConnection;

public class InsertEmployeeDto {
	
	public void insertData(EmployeeDto emp)
	{
		try
		{
		Connection conn=MySQLConnection.getConnection();
		Integer id=emp.getEid();
		String name=emp.getEname();
		String query="insert into employeeDto(eid,ename)values(?,?)";
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
	
	InsertEmployeeDto i=new InsertEmployeeDto();
	EmployeeDto emp=new EmployeeDto(104,"Ankita");
	i.insertData(emp);
}
}
