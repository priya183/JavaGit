package com.employeeEx;

import java.sql.Connection;
import java.sql.Statement;

public class InsertData {
	
	public void insertData(Employee emp)
	{
		try
		{
		Connection conn=MySQLConnection.getMySQLConnection();	
		Statement stmt=conn.createStatement();
		String id=emp.getId();
		String name=emp.getName();
		String query="insert into employee(id,name)values("+id+","+name+")";
		System.out.println(query);
		int rowAffected=stmt.executeUpdate(query);
		System.out.println("rowaffected:"+rowAffected);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	
	InsertData i=new InsertData();
	Employee e1=new Employee("'101'","'Priya'");
	i.insertData(e1);
}
}
