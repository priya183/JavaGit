package com.sqlInjectionAttack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.ex1.MySQLConnection;

public class SQLInjectionAttack {
	
	public static void main(String[] args) throws Exception
	{
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver loaded successfully");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
    System.out.println("Connection established....");
    String query="select count(*) from mytable where id=?and name=?";
	PreparedStatement pstmt=conn.prepareStatement(query);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id");
    Integer i=sc.nextInt();	
    System.out.println("Enter name");
    String name=sc.next();
    pstmt.setInt(1, i);
    pstmt.setString(2, name);
    ResultSet rs=pstmt.executeQuery();
   int c=0;
   if(rs.next())
   {
	   c=rs.getInt(1);
   }
   if(c==0)
   {
	   System.out.println("Invalid Credentials");
   }
   else
   {
	   System.out.println("Valid credentials");
   }
	}

}
