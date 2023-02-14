package com.lao.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> employeeMap= new HashMap<Integer, String>();
		
		employeeMap.put(1, "Agni");
		employeeMap.put(2, "Sahana");
		employeeMap.put(3, "Rifaya");
		employeeMap.put(4, "Rifa");
		employeeMap.put(5, "Rifa1");
		System.out.println("Employee map:"+ employeeMap);
		
		// To make a copy of existing map.
		Map<Integer, String> duplicateMap = new HashMap<Integer, String>();
		
		duplicateMap.putAll(employeeMap);
		System.out.println("Duplicate Map:" +duplicateMap);

		//clear to delete the map contents
		duplicateMap.clear();
		System.out.println("After clearing :"+ duplicateMap);
		// to check if a key is present or not 
		System.out.println("does this map has key 1?"+ employeeMap.containsKey(1));
		// to check if value is present or not
		
		System.out.println("does this map has vlaue Agni:"+ employeeMap.containsValue("Agni"));
		
		// clone the map
		System.out.println("cloned Map:"+employeeMap.clone());
		
		// Check if map is empty or not
		
		System.out.println("Is Empty: "+duplicateMap.isEmpty() );
		
		// to get the key set
		
		System.out.println("Key set"+employeeMap.keySet());
		// Fetch a vlue
		
		System.out.println(employeeMap.get(1));
		
		//Fetch All Values
		System.out.println("alla values :"+ employeeMap.values());
		
		
		// Entry set
		System.out.println("Entry Set:"+employeeMap.entrySet());
		
	}

}
