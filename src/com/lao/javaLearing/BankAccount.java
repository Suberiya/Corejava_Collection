package com.lao.javaLearing;

public class BankAccount {
	
	Long accountNumber=(long) 77789889;
	String holderName="sahana";
	
	Integer accountBalance=400;
	
	
	public void getBalance()
	{
		
		System.out.println("Account balance is"+accountBalance);
	}
	
	public void getholderName()
	{
		
		System.out.println("Holder Name is  is "+holderName);
	}

	public static void main(String[] args) {
		
		
		//he re execute from the main method so you have to crate object for main calss
		
		// Syntax
		
		// CalssName objName= new calssName
		
		BankAccount account =new  BankAccount();
		
		account.getBalance();
		account.getholderName();

		
		
		
	}

}
