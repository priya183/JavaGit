package com.methodEx;

public class A {
	
	 static void  add()// static method
	{
		int a=10;
		int b=20;
		System.out.println("Sum="+(a+b));
	}
	 void show()// instance method
	 {
		 System.out.println("learn coding");
	 }
	 public static void main(String[] args) {
		
		 add();//calling static method ....without object
		 A a=new A();
		 a.show();//calling instance method
	}

}
