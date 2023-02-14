package com.lao.SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	
	public void treeSetExample()
	//creating Object
	{
			TreeSet<Integer>treeSet = new TreeSet<Integer>();
			
			treeSet.add(10);
			treeSet.add(1);
			treeSet.add(6);
			treeSet.add(4);
			treeSet.add(2);
			treeSet.add(7);
			treeSet.add(3);
			
			System.out.println("Elements are sorted on ascending order:" + treeSet);
			
			// First
			System.out.println("First element :"+treeSet.first());
			//Last
			System.out.println("Last Element :" +treeSet.last());
			// headSet()
			System.out.println("Values lesser than given value "+treeSet.headSet(3));
			// tailSet()
			System.out.println("Values equal to and higher than given value:"+treeSet.tailSet(9));
			
			//SubSet()
			System.out.println("SubSet values :"+ treeSet.subSet(2,9));
			
			//Comparator()
			System.out.println("compatator returns null if the sorting is default natural order:"+treeSet.comparator());
			
			
			System.out.println("Higher:"+treeSet.higher(3));
			System.out.println("LOwer:"+treeSet.lower(2));
			System.out.println("Poll First:"+treeSet.pollFirst());
			System.out.println("poll Last:"+treeSet.pollLast());
			System.out.println("After polling :"+treeSet);
			
			System.out.println("Desecending order set :" +treeSet.descendingSet());
			// Normal Iteration
			Iterator<Integer> iterator= treeSet.iterator();
			
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
			
			Iterator<Integer>descIterator= treeSet.descendingIterator();
			while(descIterator.hasNext()) {
				
				System.out.println(descIterator.next());
			}
			
			
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSetExample example = new TreeSetExample();
		
		example.treeSetExample();
		

	}

}
