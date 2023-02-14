package com.lao.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, String> heros= new LinkedHashMap<String, String>();
		
		heros.put("Iron Man", "Tony Stark");
		heros.put("Bat Man", "Bruce Wayane");
		heros.put("Super Man", "clark");
		
		System.out.println(heros);
		
		HashMap<String, String> hashMapHeros= new HashMap<String, String>();
		
		
		hashMapHeros.put("Iron Man", "Tony");
		hashMapHeros.put("Bat Man", "Bruce Wayne");
		hashMapHeros.put("Super Man", "Clark");
		
		System.out.println(hashMapHeros);
		

	}

}
