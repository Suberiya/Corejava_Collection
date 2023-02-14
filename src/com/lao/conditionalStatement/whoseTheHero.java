package com.lao.conditionalStatement;

public class whoseTheHero {
	
	
	String myheroName="Captain of America";
	
	
	public void superHeroGuesser()
	{
		
		if(myheroName.equals("Iron Man"))
		{
			
			System.out.println("yes thought about iron man");
		}
		else if(myheroName.equals("Super man"))
		{
			
			System.out.println("You thought about Super Man");
			
		}
		
		else if(myheroName.equals("thor")){
			
			System.out.println("you thought about Thor");
			
			
		}
		
else if(myheroName.equals("Sahana")){
			
			System.out.println("you thought about sahana");
			
			
		}
		
else if(myheroName.equals("Captain of America")){
	
	System.out.println("you thought about Captain of America");
	
	
}
		else
		{
			System.out.println("Sorry I cant Guess!!");
			
		}

	}
	
	

	public static void main(String[] args) {
		
		
		
		whoseTheHero hero= new whoseTheHero();
		
		hero.superHeroGuesser();
		

	}

}
