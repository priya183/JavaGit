package com.employeeEx;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySqlLIkeUsingSTMT {
	
	public List<Employee> mySQLLike()
	{
		List<Employee> list=new ArrayList<>();
		try
		{
		Connection conn=MySQLConnection.getMySQLConnection();
		Statement stmt=conn.createStatement();
		String query="select * from employee2 where name like'Pr%'";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("Generated query:"+query);
		while(rs.next())
		{
			String id=rs.getString("id");
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
	
	MySqlLIkeUsingSTMT m=new MySqlLIkeUsingSTMT();
	
	List<Employee> list=m.mySQLLike();
	for(Employee e:list)
	{
		System.out.println(e);
	}
}
}
