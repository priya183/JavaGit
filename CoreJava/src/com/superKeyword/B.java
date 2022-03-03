package com.superKeyword;

public class B extends A{
	
	int a=100;
	
	public B()
	{
		//super();// call parent class contructor// likho nhi likho automatic add hoga compiler through
		System.out.println("B======Good Morning");
	}
void show()
{
	super.show();//call parent class show method
	System.out.println("A class a="+super.a);// call super/parent class variable
	System.out.println("B========-show()");
}
public static void main(String[] args) {
	
	B b=new B();
	System.out.println("B class a="+b.a);
	b.show();
}
}
