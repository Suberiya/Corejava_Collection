package com.lao.staticKeywords;

public class StaticMethodsExample {
	
	
	public static void method1()
	{
		System.out.println("Static method");
	}
	
	public void nonStatic()
	{
		System.out.println("NON Static method");
		method1();
	}

	public static void main(String[] args) {
	
		
		
		method1();
		
		//nonStatic();
	}

}
