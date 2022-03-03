package com.employeeEx;

import java.sql.Connection;
import java.sql.Statement;

public class batchUsingSTMT {
	
	public static void main(String[] args) throws Exception {
		
		Connection conn=MySQLConnection.getMySQLConnection();
		conn.setAutoCommit(false);
		Statement stmt=conn.createStatement();
	  stmt.addBatch("insert into employee2(id,name) values(106,'Nikhil')");
	  stmt.addBatch("insert into employee2(id,name) values(107,'Priti')");
	  stmt.addBatch("insert into employee2(id,name) values(106,'Kartik')");
   int[] rowAffected=stmt.executeBatch();
   System.out.println("RowAffectes:"+rowAffected);
   conn.commit();
   conn.close();
   for(int i:rowAffected)
   {
	   System.out.println("Value of i:"+i);
   }
		
	}

}
