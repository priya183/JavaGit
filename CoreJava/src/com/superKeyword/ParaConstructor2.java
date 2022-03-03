package com.superKeyword;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ParaConstructor2 extends ParaConstructor1 {
	
	public ParaConstructor2(int a)
	{
		super(100);
   System.out.println("ParaConstructor2==========Cpnstructor");
	}
	void add(int a,int b)
	{
		super.add(10, 20);
		System.out.println("child class******sum="+(a+b));
	}
public static void main(String[] args) {
	
	ParaConstructor2 p=new ParaConstructor2(200);
	p.add(11, 22);
}
}
