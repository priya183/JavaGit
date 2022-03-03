package com.interfaceEX;

import java.util.Scanner;

public class Raju implements Client {
	
	String name;
	double salary;
	

	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter salary:");
		salary=sc.nextInt();
	}

	@Override
	public void output() {
		
		System.out.println(name+" "+salary);
		
	}
public static void main(String[] args) {
	
	Client c=new Raju();
	c.input();
	c.output();
}
}
