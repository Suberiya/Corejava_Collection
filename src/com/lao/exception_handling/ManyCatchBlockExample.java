package com.lao.exception_handling;

public class ManyCatchBlockExample {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int number1= 0;
			int number2= 3;
			int result =number2/number1;
			
			System.out.println(result);
	
		}
		catch(ArithmeticException e)
		
		{
			System.out.println("dont divide a number by zero");
		}
		
		catch(NullPointerException e)
		{
			
			System.out.println("this is due to null pointer exception");
		}
		
	}

}
