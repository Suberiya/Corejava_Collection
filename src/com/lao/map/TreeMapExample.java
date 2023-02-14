package com.lao.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<String,String> PlacesInTrichy = new TreeMap<String, String>();
		
		PlacesInTrichy.put("thiruverumbur", "Trichy");
		PlacesInTrichy.put("SriRangam", "Trichy");
		PlacesInTrichy.put("Palakarai", "Trichy");
		PlacesInTrichy.put("Kallukuzhi", "Trichy");
		
//		PlacesInTrichy.put("Trichy", "abc");
//		PlacesInTrichy.put("Trichy", "MelaPuthur");
		
		System.out.println(PlacesInTrichy);
		
		
		

	}

}
