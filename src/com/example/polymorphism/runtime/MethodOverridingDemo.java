package com.example.polymorphism.runtime;

public class MethodOverridingDemo {

	public static void main(String[] args) 
	{
		RBI obj;
		obj=new RBI();
		System.out.println("Rate of Interest of RBI is "+obj.getRateOfInterest());
		SBI obj1=new SBI();
		System.out.println("Rate of Interest of SBI is "+obj1.getRateOfInterest());
		obj=new HDFC();
		System.out.println("Rate of Interest of HDFC is "+obj.getRateOfInterest());
	}

}
