package com.lao.constructor;

public class ConstructorOverLoading {
  String draw;
	
	ConstructorOverLoading()
	{
		
		System.out.println("draw a object");
	}
	
	ConstructorOverLoading(String todrawcircle)
	
	{
		this.draw=todrawcircle;
		
		System.out.println("Drawing" +todrawcircle );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConstructorOverLoading constructorOverLoading = new ConstructorOverLoading();
		
		
		ConstructorOverLoading constructorOverLoading1= new ConstructorOverLoading("circle");
		constructorOverLoading1=new ConstructorOverLoading("circle");
	}

}
