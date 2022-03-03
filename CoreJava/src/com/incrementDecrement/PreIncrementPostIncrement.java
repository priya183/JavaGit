package com.incrementDecrement;

public class PreIncrementPostIncrement {
	
	public static void main(String[] args) {
		
		int a;
		int b=1;
		System.out.println(b);//1
		a=b++;
		System.out.println(a);//firstly value will be assigned //1
		System.out.println(b);//then value will be increase   //2
		System.out.println(b);//2
		
		a=a++ + b++;//1+2
		System.out.println(a);//3
		
		a=b++ + b++;//already value a=3:2+2==>7
		System.out.println(a);
		
		a=b++ + ++b;//a=7:2+3==>12
		System.out.println(a);
		
		
	}

}
