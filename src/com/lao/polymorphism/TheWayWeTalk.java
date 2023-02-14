package com.lao.polymorphism;

public class TheWayWeTalk {
	
	
	
	public void talk(Parents styleOfTalking)
	{
		
		System.out.println("Politte, Respectful!!");
		
		
	}
	
public void talk(Boss styleOfTalking)
{
	
	System.out.println("Nothing to Personal");
}
public void talk(Partner styleOfTalking)
{
	
	System.out.println("Romantic and love mixture of everything");
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TheWayWeTalk talk= new TheWayWeTalk();
		
		
		Parents parents= new Parents();
		talk.talk(parents);
		
		Boss boss = new Boss();
		
		talk.talk(boss);
		
		
		Partner partner = new Partner();
		
		talk.talk(partner);
	}
	

}
