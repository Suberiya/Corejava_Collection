package com.lao.SetCollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public void linkedHashSetExample()
	{
		Set linkedHashSet= new LinkedHashSet();
		
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("10");
		linkedHashSet.add("10");
		
		linkedHashSet.remove("10");
		
		System.out.println("Insertion Order preserved linked hsh Set :"+linkedHashSet);
		
		System.out.println("Size:" + linkedHashSet.size());
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSetExample example= new LinkedHashSetExample();
		
		example.linkedHashSetExample();
	}

}
