package com.thisKeyword;
//this keyword refers to the current object inside method or constructor.
public class A {
	
	void show()
	{
		System.out.println(this);// similar as object of current class//com.thisKeyword.A@cac736f

	}
public static void main(String[] args) {
	
	A a=new A();
	System.out.println(a);//com.thisKeyword.A@cac736f

	a.show();
}
}
