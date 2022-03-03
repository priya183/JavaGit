package com.variableEx;

public class StaticVariable {
	
	static int a=10;//static variable
	
	void fun()
	{
		int b=10;//local variable
		System.out.println(a+" "+b);
		++a;
		++b;
	}
	public static void main(String[] args) {
		
		StaticVariable s=new StaticVariable();
		s.fun();//10 10
		s.fun();//11 10
		
	}

}
//here ,variable b is a local variable therefore 2nd time it will print 10 other than 11, because as it local variable after the first
//call of method its memory will destroy.
//2nd time the value of static variable will print 11,because the static variable creates memory which store the value of static variable
//for life time throughout the program..