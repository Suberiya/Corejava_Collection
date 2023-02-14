package com.lao.staticKeywords;

public class ExampleStaticKeyWord {
		public static void staticKeyWords()
	{
		System.out.println("Static methods");
	}
	
	public void statickeyword2()
	{
		staticKeyWords();
		
	System.out.println("Hi Im Static methods 2");
	}
	public static void main(String[] args) {
		staticKeyWords();
		
	}

}
