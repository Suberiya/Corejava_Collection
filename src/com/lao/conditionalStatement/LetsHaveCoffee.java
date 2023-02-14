package com.lao.conditionalStatement;

public class LetsHaveCoffee {
	
	
	//   boolean data type value true- or false
	
	boolean iscupEmpty=false;
	
	boolean isMilkpure=true;
	
	

	public static void main(String[] args) {

		
		
		LetsHaveCoffee coffee=new LetsHaveCoffee();
		
		LetsHaveCoffee coffee2=new LetsHaveCoffee();
		
		if(coffee.iscupEmpty)
		{
			
			System.out.println("Fille the Cup");
		}
		
		else
		{
			System.out.println("lets have drink a coffee");
			
		}
		
		if(coffee2.isMilkpure==true)
			
		{
			System.out.println("the Milk quality");
			
		}
		else {
			
			System.out.println("the milk is un quality");
		}
	}
	
	
	
	
	
	
	
		
		

}
