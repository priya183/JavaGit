package com.thisKeyword;
//It used to avoid the confusion between instance and local variable

public class B {
	
	int a;
	public B(int a)
	{
		this.a=a;
		System.out.println(a);
	}
public static void main(String[] args) {
	
	new B(10);
}
}
