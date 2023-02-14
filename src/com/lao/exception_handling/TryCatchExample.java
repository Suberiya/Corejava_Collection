package com.lao.exception_handling;

public class TryCatchExample {
	static String a = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try {
	            System.out.println(a.length());
	        } catch (NullPointerException e) {
	            System.out.println(e);
	        }
	        System.out.println("Exception is handled");
	    }
		
		
		
	}
	
	


