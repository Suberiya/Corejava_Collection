package com.lao.SetCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	
	public void basicExampleHashSet()
	
	{
		
		HashSet<String> hashSet= new HashSet<String>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A");
		
		hashSet.add(null);
		hashSet.add("G");
		
		// We have no control on insertion order
		
		System.out.println("contents of the hashSet: "+hashSet);
		hashSet.remove(null);
		System.out.println("Contents of the HashSet :"+ hashSet);
		System.out.println(hashSet.contains("A"));
		
	}
		// Iterator using Iterator
		
		public void iteratorUsingIterator()
		
		{
			HashSet<String> hashSet= new HashSet<String>();
			
			hashSet.add("A");
			hashSet.add("B");
			hashSet.add("C");
			hashSet.add("D");
			hashSet.add("E");
			hashSet.add("F");
			hashSet.add("G");
			
			Iterator<String> iterator= hashSet.iterator();
			While(iterator.hasNext());
			{
				System.out.println("Elements of HashSet:"+ iterator.next());
			}
			
		}
		
	
	
	
	private void While(boolean hasNext) {
			// TODO Auto-generated method stub
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSetExample example = new HashSetExample();
		
		example.basicExampleHashSet();
		example.iteratorUsingIterator();
	}

}
