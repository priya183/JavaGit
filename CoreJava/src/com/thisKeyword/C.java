package com.thisKeyword;
//it is used when we want to call default constructor
public class C {
	
	public C()
	{
		System.out.println("default construvtor");
	}
	C(int a)
	{
		this();
		System.out.println("a="+a);
	}
	
public static void main(String[] args) {
	
	new C(10);
}
}
