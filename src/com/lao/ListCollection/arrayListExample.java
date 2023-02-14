package com.lao.ListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayListExample {

	
	
	public void arrayListExamples()
	{
		List <String> arrayList= new ArrayList<String>();
		
		arrayList.add("Benz");
		arrayList.add("BMW");
		arrayList.add("Bugatti");
		
		arrayList.add("Bugatti");
		arrayList.add("Bentley");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.indexOf("Maruti"));
		System.out.println(arrayList.lastIndexOf("Bugatti"));
		
		// how to push from onelist to another
		
		List<String> anotherList = new ArrayList<String>();
		
		anotherList.addAll(arrayList);
		
		System.out.println(arrayList);
		 
		anotherList.clear();
		System.out.println(anotherList);
		
		arrayList.remove(0);
		
		System.out.println(arrayList);
		
		arrayList.remove("Benz");
		
		System.out.println(arrayList);
		arrayList.add(null);
		System.out.println(arrayList);
		
		arrayList.set(0, "Suzuki");
		
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
		
		// iterate
		System.out.println("=====Using ForEach =========");
		for (String string : arrayList) {
			
			System.out.println(string);
			
		}
		
	System.out.println("=====LOop =========");
		for(int i=0; i<arrayList.size(); i++)
		{
		 System.out.println(arrayList.get(i));
		 
		}
		
	System.out.println("=======ListIteraror");
	
	ListIterator<String> iterator_List= arrayList.listIterator();
	
	while(iterator_List.hasNext())
	{
		iterator_List.next();
		System.out.println(iterator_List.next());
	}
	
	while(iterator_List.hasPrevious())
	{
		iterator_List.next();
		System.out.println(iterator_List.previous());
	}
	
	System.out.println("Iterator");
	
	Iterator<String> iterator=  arrayList.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.hasNext());
	}
	
	
	}
	
	
	
	public static void main(String[] args) {
		
		
		arrayListExample example= new arrayListExample();
		
		example.arrayListExamples();
	}

}
