package com.employeeEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetAllData {
	
	public List<Employee> getAllData()
	{
		List<Employee> list=new ArrayList<>();
		try
		{
			Connection conn=MySQLConnection.getMySQLConnection();
			String query="select * from employee";
			PreparedStatement pstmt=conn.prepareStatement(query);
			ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			Integer id=rs.getInt("id");
			String sid=id.toString();
			String name=rs.getString("name");
			Employee emp=new Employee(sid,name);
			list.add(emp);
		}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		GetAllData g=new GetAllData();
		List<Employee> list=g.getAllData();
		for(Employee e:list)
		{
			System.out.println(e);
		}
	}

}
