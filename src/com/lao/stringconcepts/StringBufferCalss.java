package com.lao.stringconcepts;

public class StringBufferCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	To Demonstrate the String Buffer is mutable.
		
	System.out.println("String is ImMutable");
	String name="Rifaya";
	System.out.println("Appending a name to Original:"+name.concat("Safana"));
	System.out.println("Original name is" +name);
	
	System.out.println("*********************");
	
	System.out.println("String Buffer Mutable");
	
	StringBuffer name1= new StringBuffer("Safana");
	System.out.println("Appending a name to Original :"+name1.append("Sahana"));
	
	System.out.println("Original name is"+name1);
	 
	//String Buffer Methods
	//Reverse
		
	System.out.println("reversed name is"+name1.reverse());
	
	
	//Replacce
	
	
	StringBuffer replaceThis= new StringBuffer("sahana");
	
	System.out.println(replaceThis.replace(0,3, "Rifa"));
// Delete	
StringBuffer delete= new StringBuffer("xyzsahana");
	
	System.out.println(delete.delete(0,3));
	//Insert
StringBuffer insert1= new StringBuffer("sahana");
	
	System.out.println(insert1.insert(3, "shaj"));
	
	//capacity
	
	//StringBuilder is Non Synchronized   
	
	//StringBuffer is Synchronized 
	
//	System.out.println(insert.capacity());
	}
	
	
	
	
	

}



