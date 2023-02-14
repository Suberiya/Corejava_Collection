package com.lao.constructor;

public class NoArgumentConstructor {

	
	int employeeId;
	
	String Emp_Name;
	//Define a Constructor
	
	NoArgumentConstructor()
	
	{
		this.employeeId= 077;
		this.Emp_Name="Sahana";
		System.out.println("No Argument construtor is created ");
	}
	
	
	public static void main(String[] args) {
		
		
		
		NoArgumentConstructor noArgumentConstructor = new NoArgumentConstructor();
		
	}

}
