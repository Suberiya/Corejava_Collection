package com.lao.javaLearing;

public class Employee {

	int employeeId;
	String employeeName;
	
	//Define a No Arg Constructor
	
	Employee(){
		
		employeeId=1;
		
		employeeName="Sahana";
		
		System.out.println("employee Object is created");
		
	}
	
	
	public static void main(String[] args) {
		
		Employee employee=new Employee();


	}

}
