package com.thisKeyword;
//it is also used to call parameterize construcor

public class D {
	
	D()
	{
		this(10);
		System.out.println("Defuault C....");
	}
	D(int a)
	{
		this(100,200);
		System.out.println("a="+a);
	}
	D(int a,int b)
	{
		System.out.println("a="+a+" b="+b);
	}
public static void main(String[] args) {
	
	new D();
}
}
