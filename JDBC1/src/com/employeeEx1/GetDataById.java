package com.employeeEx1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetDataById {
	
	
	public List<Employee> getById(Integer QueryInputId)
	{
		List<Employee> list=new ArrayList<>();
		try
		{
		Connection conn=MySQLConnection.getConnection();
		String query="select * from employee2 where id=?";
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, QueryInputId);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			Integer id=rs.getInt("id");
			String name=rs.getString("name");
			Employee emp=new Employee(id,name);
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
		
		GetDataById g=new GetDataById();
		List<Employee> list=g.getById(101);
		for(Employee e:list)
		{
			System.out.println(e);
		}
	}

}
