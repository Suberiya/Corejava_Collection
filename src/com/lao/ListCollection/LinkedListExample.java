package com.lao.ListCollection;

import java.util.LinkedList;

public class LinkedListExample {
//Create a simple Linked List
	public void linkedListExampleOperation()
	{
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	
	linkedList.add(2);
	linkedList.add(3);
	linkedList.add(4);
	linkedList.add(4);
	linkedList.add(6);
System.out.println("Linked List:"+linkedList);

// Add an element to the first position
linkedList.addFirst(0);
System.out.println("Linked list after adding first:" +linkedList);


// Add an element to the last position

linkedList.addLast(1);



System.out.println("Linked list last add:" +linkedList);

//get the first value

System.out.println("To get the laast value:"+linkedList.getFirst());

// To get the first value using index position

System.out.println("first value using index :" +linkedList.get(0));

System.out.println("Third value of the list:"+linkedList.get(3) );


// RemoveFirst and Remove Last
System.out.println("Remove First:"+linkedList.removeFirst());
System.out.println(linkedList);

System.out.println("Remove last:" + linkedList.removeLast());
System.out.println(linkedList);

// pollast delete the last
linkedList.pollLast();

System.out.println(linkedList);
// remove delete the first element

linkedList.remove();

System.out.println(linkedList);


// poll method and pollfirst() delete the first element in the list
System.out.println(linkedList.poll());

System.out.println(linkedList);

// removeFirstOccurense
linkedList.removeFirstOccurrence(2);

System.out.println(linkedList);

//removeLastOccurence
linkedList.removeLastOccurrence(6);
System.out.println(linkedList);

System.out.println("After removing the last occurence of 6 :"+ linkedList);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedListExample example = new LinkedListExample();
		example.linkedListExampleOperation();

	}

}
