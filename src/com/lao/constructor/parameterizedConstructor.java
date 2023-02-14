package com.lao.constructor;

public class parameterizedConstructor {
	
	
	String animal_name;
	String animal_type;
	
	parameterizedConstructor(String name, String type)
	
	{
		animal_name = name;
		
		animal_type = type;
		
	}
public void sayAboutAnimal()
{
	System.out.println("Animal name is"+ animal_name+ "and type is" +animal_type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parameterizedConstructor parameterizedConstructor = new parameterizedConstructor("Duck", "Omnivores");
		
		
		parameterizedConstructor.sayAboutAnimal();
		parameterizedConstructor parameterizedConstructor2= new parameterizedConstructor("Bear", "OmniVersoe");
		
		parameterizedConstructor2.sayAboutAnimal();
	}

}
