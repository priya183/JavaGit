package com.employeeEx1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetAllemployee {
	
	public List<Employee> getAllData()
	{
		List<Employee> list=new ArrayList<>();
		try
		{
		Connection conn=MySQLConnection.getConnection();
		String query="select * from employee2";
		PreparedStatement pstmt=conn.prepareStatement(query);
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
	
	GetAllemployee g=new GetAllemployee();
	List<Employee> list=g.getAllData();
	for(Employee e:list)
	{
		System.out.println(e);
	}
}
}
