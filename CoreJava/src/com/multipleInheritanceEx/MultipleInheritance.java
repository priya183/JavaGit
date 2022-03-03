package com.multipleInheritanceEx;

public class MultipleInheritance implements A,B{

	@Override
	public void show() {
		
		
		System.out.println("Hello");
	}
public static void main(String[] args) {
	
	MultipleInheritance s=new MultipleInheritance();
	s.show();
}
}
