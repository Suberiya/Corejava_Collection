package com.lao.javaLearing;

public class Animal {
String animal_name;
String animal_type;
	
	//Define parameterization Constructor
Animal(String naming, String typing)


{
	animal_name=naming;
	animal_type=typing;
}


public void sayAboutAnimal()
{
System.out.println("Animal name is " +animal_name+" animal type is" + animal_type);
}
	public static void main(String[] args) {
		
		Animal animal1=new Animal("duck", "verbose");
		
		animal1.sayAboutAnimal(); 
		
		Animal animal2 = new Animal("cat", "pet");
		
		animal2.sayAboutAnimal();
		
		Animal animal3=new Animal("Tiger","Wild");
		
		animal3.sayAboutAnimal();
	}

}
