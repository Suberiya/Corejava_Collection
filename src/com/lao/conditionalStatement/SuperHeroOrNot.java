package com.lao.conditionalStatement;

public class SuperHeroOrNot {

	String hero = "captain of America";
	
	public void heroOrNot()
	{
		{
			switch (hero) {
			case "captain of America":
				System.out.println("captain of America is a super hero");
				break;
			case "Super Man":
				System.out.println("Super man is a super hero");
			case "Bat Man":
				System.out.println("Bat man is a super hero");
				break;

			default:
				
				System.out.println(hero+"is not a super hero");
			
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		SuperHeroOrNot not = new SuperHeroOrNot();
		
		not.heroOrNot();
	}

}
