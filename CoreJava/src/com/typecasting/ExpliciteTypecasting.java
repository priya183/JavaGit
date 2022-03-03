package com.typecasting;

public class ExpliciteTypecasting {
	
	public static void main(String[] args) {
		
		
		//Primitive to primitive conversion
		int i=100;
		float f=(float)i;//Explicite typecasting
		System.out.println(f);
		float ff=(int)i;//Explicite typecasting
		System.out.println(ff);
		long l=i;//Implicite typecasting
		System.out.println(l);
		
		
       //wrapper to wrapper
		Integer i1=10;
		Long ll=i1.longValue();//Explicite typecasting
		//Long lll=i1;  //Implicite typecasting not possible
		
		//wrapper class to primitive(Implicite converison)
		Integer a1=100;
		long l2=a1;
		System.out.println(l2);
		
		// primitive to wrapper class (Implicite converison)
	  int a=10;
	  Integer b=a;
	  System.out.println(b);
	  
	//wrapper class to primitive(Explicite converison)/unboxing
	  Integer aa=200;
	  int vv=aa.intValue();
	  System.out.println(vv);
	  
	//primitive to wrapper class(Explicite converison)/autoboxing
	  int ss=33;
	  Long nn=Long.valueOf(ss);	  
	
	}

}
