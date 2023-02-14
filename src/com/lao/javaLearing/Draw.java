package com.lao.javaLearing;

public class Draw {
	
	
	String draw;
	
	
	Draw(){
		
		System.out.println("Drawing object created" );
		
		
	}
	
	Draw(String toDraw)
	{
		draw=toDraw;
		
		System.out.println("Drawin is circle "+ 	toDraw );
	}
	public static void main(String[] args) {

Draw draw1=new Draw();


Draw draw2=new Draw("circle");
		
		 
		
	}

}
