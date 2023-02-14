package com.lao.constructor;

public class ChildClass extends ParentClass{
	
	
	ChildClass()
	{
	super();
	// when it will come parent child relationship ==> super(); 
	
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass childClass = new ChildClass();

	}

}
