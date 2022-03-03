package com.inheritanceEx;

public class MC extends MB{
	
	void rem()
	{
		c=a%b;
		System.out.println("Remainder="+c);
	}
public static void main(String[] args) {
	
	MC c=new MC();
	c.add();
	c.sub();
	c.mul();
	c.div();
	c.rem();
}
}
