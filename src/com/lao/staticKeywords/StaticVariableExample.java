package com.lao.staticKeywords;

public class StaticVariableExample {

static int accountBalance=0;

static String depositedBy;

public static void main(String[] args) {
		
	StaticVariableExample example1= new StaticVariableExample();
		
		example1.accountBalance =1000;
		
example1.depositedBy="Sahana";
	
StaticVariableExample example2=new StaticVariableExample();

example2.accountBalance=2000;
	example2.depositedBy="Rifaya";
	
	System.out.println("Example1 Integer"+accountBalance);
System.out.println("Exampl2 String"+depositedBy);
System.out.println("Example2 Integer"+accountBalance);
System.out.println("Example2 String"+depositedBy);
	}

}
