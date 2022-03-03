package com.tryWithResources;
//1.7 from 1.7 we need not to close the opened resources ,they will automatically closed after closing try block
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter name");
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			String name=br.readLine();
			System.out.println("Nmae="+name);
			System.out.println("no need to close resources , it will autpmatically close after closing try block");
		}
		
	}

} 
