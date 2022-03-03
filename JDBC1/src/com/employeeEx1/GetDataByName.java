package com.employeeEx1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetDataByName {
	
	public List<Employee> getByName(String QueryInputName)
	{
		List<Employee> list=new ArrayList<>();
		try
		{
		
		Connection conn=MySQLConnection.getConnection();
		String query="select * from employee2 where name=?";
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setString(1, QueryInputName);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			Integer id=rs.getInt("id");
			String name=rs.getString("name");
			Employee e=new Employee(id,name);
			list.add(e);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		
		GetDataByName  g=new GetDataByName();
		List<Employee> list=g.getByName("Priya");
		for(Employee emp:list)
		{
			System.out.println(emp);
		}
	}

}
