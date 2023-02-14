package com.lao.stringconcepts;

public class StringMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String name="Agni";//string literal
	//name="Riya";
	int number= 3;
	System.out.println(name);
		
		System.out.println(name.charAt(1));
		
	// returns string length
		System.out.println(name.length());
		
		
		//Checks the equality of string with the given object
		
		System.out.println(name.equals("sha"));
		
		// checks the equality of string with the given object without case sensiivity
		
		System.out.println(name.equalsIgnoreCase("AGNI"));
		
		// checks if string is empty or not.
		
		System.out.println(name.isEmpty());
		
		// returns true or false based on the given value is present or not
		System.out.println(name.contains("A"));
		
		// take a particular portion of the string begin and end index
		
		System.out.println(name.substring(1,3));
		// appends the string to the given string
		
		System.out.println(name.concat("sahana"));
		
		// replaces the existing char with given char
		
		System.out.println(name.replace("g", "G"));
		
		System.out.println(name.replace("Agni", "Shaj"));
		
		// fin the position of a character in the string 
		System.out.println(name.indexOf("A"));
		// finds the character specified from the index position 
		
		System.out.println(name.indexOf('i', 2));
		System.out.println(name.indexOf("sath", 1));
		
		// Trim will remove the white space before and after
		
		System.out.println(name.trim());
		
		// convert the given data type to string
		System.out.println(String.valueOf(number));
		
		String Uppercase ="SHAJAHAN";
		System.out.println(Uppercase.toLowerCase());
		
		String LowerCase= "sahana";
		
		System.out.println(LowerCase.toUpperCase());
		
		// Returns a joined String with given Delimiter
		
		System.out.println(String.join("-", "Learn", "Automation","Online"));
		
		System.out.println(String.join("/", "30", "40","1990"));
		
		
		// split 
		String splitThis= "am, I, teaching, good?";
		
		String[] splitedWords= splitThis.split(",");
		for(String string: splitedWords)
		{
			System.out.println(string);
		}
	}
	
	
	
	
	

}
