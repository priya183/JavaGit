package com.employeeEx;

import java.sql.Connection;
import java.sql.PreparedStatement;

//PreparedStatement
public class AddEmployee2 {
	
	public void addEmp(Employee emp)
	{
		try
		{
		String id=emp.getId();
		Integer ii=Integer.parseInt(id);
		String name=emp.getName();
		Connection conn=MySQLConnection.getMySQLConnection();
		System.out.println("Established connection....");
		String query="insert into employee(id,name)values(?,?)";
		PreparedStatement pstmt=conn.prepareStatement(query);
        pstmt.setInt(1, ii);
        pstmt.setString(2, name);
        System.out.println("Generated Query:"+query);
        int rowAffected=pstmt.executeUpdate();
        System.out.println("rowAffected:"+rowAffected);
	}
catch(Exception e)
		{
	e.printStackTrace();
		}
}
	public static void main(String[] args) {
		
		AddEmployee2 a=new AddEmployee2();
		Employee emp=new Employee("104","Vikas");
		a.addEmp(emp);
	}
}