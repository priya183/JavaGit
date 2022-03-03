package com.variableEx;

public class A {
	
	
	int a=10;//Global variable//instance variable
	static int c=30;//static variables
	int add(int x, int y)//local variables
	{
		int d=100;//local variables
		System.out.println("D="+d);
		return x+y;
	}
	public static void main(String[] args) {
		
		int b=20;//Local variable
		A a=new A();
		System.out.println("A="+a.a);//access instance variable
		System.out.println("B="+b);//access local variable
		System.out.println("C="+c);//access static variable
		int sum=a.add(10, 20);//access local variable
		System.out.println("Sum="+sum);
	
		
	}

}
