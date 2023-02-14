package com.lao.polymorphism;

public class Sons extends Parents{

	@Override
	public void marriage()
	
	{
		System.out.println("marriage is my rules");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parents parents = new Sons();// ParentClass ref= new childclass obj
		
		parents.propertise();
		//parents.marriage();
	}

}
