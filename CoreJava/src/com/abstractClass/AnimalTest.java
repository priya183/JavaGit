package com.abstractClass;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal a;
		a=new AnimalLion();
		a.sound();
		
		a=new AnimalDog();
		a.sound();
	}

}
