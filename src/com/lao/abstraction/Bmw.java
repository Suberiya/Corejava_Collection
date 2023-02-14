package com.lao.abstraction;

public class Bmw extends Car implements UpComingProjects{
@Override
	public void engineSecret()
	{
		System.out.println("Ths is BMW Secrect");
	}
@Override
	public void companyvalt()
	{
		System.out.println("This BMW valt");
	}
	
	
	public static void main(String[] args) {
		
		
		Car car= new Bmw();
		  
		car.companyvalt();
		car.engineSecret();

	}
	@Override
	public void employee() {
		System.out.println("this is employee");
		
	}
	@Override
	public void method1() {
		System.out.println("this is method");
		
		
	}
	@Override
	public void method3() {
		System.out.println("this is method3");
		
		
	}

}
