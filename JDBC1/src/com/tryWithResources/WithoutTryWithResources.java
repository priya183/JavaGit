package com.tryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MulticastSocket;

//in 1.6 we need to close  the resources in the finally block which we open and use.
//if we not close it will be blocked or wasted, due to this complexity of the program increases
//so we should need to write finally block, so the length of the code increases and redability will down.
public class WithoutTryWithResources {
	public static void main(String[] args) throws IOException{
		
		System.out.println("Enter name:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String name=br.readLine();
	  System.out.println("nmae:"+name);
		}
		finally
		{
			br.close();
			System.out.println("BufferedReader Object close...");
		}
	}
	
	

}
