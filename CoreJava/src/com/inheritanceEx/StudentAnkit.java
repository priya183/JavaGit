package com.inheritanceEx;

public class StudentAnkit extends Student{

	void display()
	{
		super.diaplay();
		id=101;
		marks=80;
		name="Priya";
		System.out.println(id+" "+marks+" "+name);
	}
	public static void main(String[] args) {
		
		StudentAnkit s=new StudentAnkit();
		s.display();
	}
}
