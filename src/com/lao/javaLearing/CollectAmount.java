package com.lao.javaLearing;

public class CollectAmount {
public Integer collectedAmount=1000;
	
	public Integer collectedAmountAndGiveItToMe()
	{
		System.out.println("Daddy has collected Rupees" + collectedAmount+ "sent it to you");
		return collectedAmount;
	}
	
	public static void main(String[] args) {
		
		
		CollectAmount mySon= new CollectAmount();
		
	Integer amount=	mySon.collectedAmountAndGiveItToMe();
	
	System.out.println("Got the Amount son has " +amount);


		

	}

}
