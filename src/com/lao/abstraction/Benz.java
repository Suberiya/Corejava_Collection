package com.lao.abstraction;

public class Benz extends Car implements UpComingProjects, Interface2{

	@Override
	public void engineSecret()
	{
		System.out.println("Ths is Benz Secrect");
	}
@Override
	public void companyvalt()
	{
		System.out.println("This Benz valt");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car=new Benz();
		
		car.companyvalt();
		car.engineSecret(); 

	}
	@Override
	public void employee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}
