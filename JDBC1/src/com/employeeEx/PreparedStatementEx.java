package com.employeeEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementEx {
	
	public static void main(String[] args) throws Exception {
		
		Connection conn=MySQLConnection.getMySQLConnection();
		String query="insert into employee2(id,name) values(?,?)";
		PreparedStatement pstmt=conn.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter employee id:");
			Integer id=sc.nextInt();
			System.out.println("Enter employee name:");
			String name=sc.next();
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			int rowaffected=pstmt.executeUpdate();
			System.out.println("rowaffected:"+rowaffected);
			System.out.println("Record inserted successfully:");
			System.out.println("Do you wNT TO INSERT ONE MORE RECORD?(Yes/No)");
		  String option=sc.next();
		  if(option.equalsIgnoreCase(option))
		  {
			  break;
		  }
		}
	}

}
