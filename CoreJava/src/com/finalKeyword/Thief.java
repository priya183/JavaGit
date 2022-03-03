package com.finalKeyword;

public class Thief extends Test {
	@Override
	void uname()
	{
		System.out.println("Priya");
	}
	@Override
  void pin()
  {
	  System.out.println("19101");
  }
	@Override
  void show()
  {
	  System.out.println("Salary:"+salary);
  }
	/*
	 * @Override final void m1() { System.out.println("m1"); } // final method cannot be ovveride
	 */
public static void main(String[] args) {
	
	Test t=new Thief();
	t.uname();
	t.pin();
	t.show();
}
}
